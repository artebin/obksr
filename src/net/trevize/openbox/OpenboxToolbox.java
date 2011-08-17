package net.trevize.openbox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.trevize.openbox.jaxb.Keybind;
import net.trevize.openbox.jaxb.OpenboxConfig;

public class OpenboxToolbox {

	public static void main(String[] args) {
		OpenboxToolbox ob_toolbox = new OpenboxToolbox();
		ob_toolbox.loadOpenboxConfig("./schemas/rc.xml");
		String keyboard_shortcuts = ob_toolbox.extractKeyboardShortcuts();

		try {
			FileWriter fw = new FileWriter("./keyboard_shortcuts");
			fw.write(keyboard_shortcuts);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private JAXBContext jaxb_context = null;
	private Unmarshaller u = null;
	private OpenboxConfig openbox_config = null;

	public OpenboxToolbox() {
		initJAXB();
	}

	private void initJAXB() {
		// init the JAXB objects
		try {
			jaxb_context = JAXBContext.newInstance("net.trevize.openbox.jaxb");
			u = jaxb_context.createUnmarshaller();
			u.setProperty("com.sun.xml.internal.bind.ObjectFactory",
					new OpenboxConfig());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void loadOpenboxConfig(String path) {
		// load the OpenSearchDescription objects
		File f = new File(path);
		String real_path = null;
		try {
			real_path = f.getCanonicalPath();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			openbox_config = (OpenboxConfig) u.unmarshal(f);
		} catch (JAXBException e) {
			System.err.println("Error while parsing the file " + real_path);
			e.printStackTrace();
		}
	}

	public String extractKeyboardShortcuts() {
		StringBuffer sb = new StringBuffer();
		for (Keybind keybind : openbox_config.getKeyboard().getKeybind()) {
			String name = keybind.getAction().getName();
			String key = keybind.getKey();
			sb.append(name + " = " + key + "\n");
		}
		return sb.toString();
	}

}
