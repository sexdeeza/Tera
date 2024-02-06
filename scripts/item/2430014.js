/*
	名字:	彩色菇菇芽孢
	地圖:	彩色菇菇芽孢
	描述:	任務消耗品
*/

function start() {
	if (im.getPlayer().getMap().getId() == 106020300 && im.getPlayer().getPosition().x > 1100 && im.getPlayer().getPosition().y < 40) {
		im.gainItem(2430014, -1);
		im.getPlayer().getQuestNAdd(Packages.server.quest.MapleQuest.getInstance(2314)).setCustomData(2);
		im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "屏障已經被移除，障礙被打破了"));
		im.dispose();
		return;
		}
		im.dispose();
		im.openNpc(1300010);
}