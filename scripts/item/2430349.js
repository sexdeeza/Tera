/*
	名字:	越野機車90日使用券
	地圖:	越野機車90日使用券
	描述:	騎乘技能
*/

function start() {
	im.gainItem(2430349, -1);
	im.getPlayer().changeSingleSkillLevel(Packages.client.SkillFactory.getSkill(80001005), 1, 1, im.getCurrentTime() + (90 * 24 * 60 * 60 * 1000));
	im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "角色獲得了新的騎獸技能"));
	im.dispose();
}