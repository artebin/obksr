#!/bin/sh

icon=/home/nicolas/.config/openbox/obskr/openbox-logo-3.png
keyboard_shortcuts=`cat /home/nicolas/.config/openbox/obskr/keyboard_shortcuts`
notify-send --icon="$icon" "Openbox keyboard shortcuts" "$keyboard_shortcuts"