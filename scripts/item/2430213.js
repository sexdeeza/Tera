/*
	名字:	提神飲料-維他命C飲料
	地圖:	提神飲料-維他命C飲料
	描述:	特殊消耗品
*/

function start() {
	var time = parseInt(im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2430213)).getCustomData());
	if (time + (1 * 60000) > im.getCurrentTime()) {
		im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "再次使用提神飲料必須間隔10分鐘"));
		im.dispose();
		return;
		}
	if (im.getPlayer().getFatigue() < 1) {
		im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "角色精力飽滿，不需要飲用提神飲品"));
		im.dispose();
		return;
		}
		im.gainItem(2430213, -1);
		im.getPlayer().setFatigue(im.getPlayer().getFatigue() - 10);
		im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2430213)).setCustomData("" + im.getCurrentTime());
		im.dispose();
}