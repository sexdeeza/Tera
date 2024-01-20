var status = 0;
var maps = Array(130000000, 140000000, 100000000, 104000000, 102000000, 101000000, 103000000, 120000000, 105000000, 200000000, 211000000, 220000000, 230000000, 240000000, 250000000, 251000000, 221000000, 222000000, 600000000, 800000000, 801000000, 260000100, 300000000, 540000000, 550000000, 551000000, 310000000);
var show;
var selectedMap = -1;
var time = 0; // Initialize the time variable to 0.

function start() {
    status = -1;
    action(1, 0, 0);
}

function action(mode, type, selection) {
    if (status == 1 && mode == 0) {
        cm.dispose();
        return;
    } else if (status >= 2 && mode == 0) {
        cm.sendNext("There's a lot to see in this town, too. Come back and find us when you need to go to a different town.");
        cm.dispose();
        return;
    }
    if (mode == 1)
        status++;
    else
        status--;
    if (status == 0) {
        // Check if enough time has passed since the last use.
        if (time + (30 * 60000) >= cm.getCurrentTime()) {
            cm.sendOk("You already used my services in the last 30 minutes. Time left: " + cm.getReadableMillis(time + (30 * 60000), cm.getCurrentTime()));
            cm.dispose();
            return;
        }

        cm.sendNext("Hello, I am Irvin. If you want to go from town to town safely and fast, then ride in my plane. We'll gladly take you to your destination for free but at a 30-minute cooldown.");
    } else if (status == 1) {
        var selStr = "Choose your destination, for it's free. Fees have been removed for this service.#b";
        for (var i = 0; i < maps.length; i++) {
            if (maps[i] != cm.getMapId()) {
                selStr += "\r\n#L" + i + "##m" + maps[i] + "# (Free)#l";
            }
        }
        cm.sendSimple(selStr);
    } else if (status == 2) {
        cm.sendYesNo("You don't have anything else to do here, huh? Do you really want to go to #b#m" + maps[selection] + "##k for free?");
        selectedMap = selection;
    } else if (status == 3) {
        // Update the time variable to the current time before the service is used.
        time = cm.getCurrentTime();
        cm.warp(maps[selectedMap]);
        cm.dispose();
    }
}