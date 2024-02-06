/*
	名字:	荊棘解除劑
	地圖:	荊棘解除劑
	描述:	任務消耗品
*/

function start() {
	if (im.getPlayer().getMap().getId() == 106020500) {
		im.gainItem(2430015, -1);
	if (im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2324)).getStatus() < 1) {
		Packages.server.quest.MapleQuest.getInstance(2324).forceStart(im.getPlayer(), 0, null);
		}
		im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2324)).setCustomData(1);
		im.getPlayer().updateQuest(im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2324)), true);
		im.getPlayer().changeMap(im.getMap(106020502), im.getMap(106020502).getPortal(0)); //城壁邊邊
		im.dispose();
		return;
		}
		im.dispose();
		im.openNpc(1300011);
}