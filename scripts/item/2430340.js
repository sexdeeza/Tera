/*
	名字:	底盤車90日使用券
	地圖:	底盤車90日使用券
	描述:	騎乘技能
*/

function start() {
	im.gainItem(2430340, -1);
	im.getPlayer().changeSingleSkillLevel(Packages.client.SkillFactory.getSkill(80001032), 1, 1, im.getCurrentTime() + (90 * 24 * 60 * 60 * 1000));
	im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "角色獲得了新的騎獸技能"));
	im.dispose();
}