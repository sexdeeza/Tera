/*
	名字:	貓熊使用券(1年)
	地圖:	貓熊使用券(1年)
	描述:	騎乘技能
*/

function start() {
	im.gainItem(2430688, -1);
	im.getPlayer().changeSingleSkillLevel(Packages.client.SkillFactory.getSkill(80001112), 1, 1, im.getCurrentTime() + (365 * 24 * 60 * 60 * 1000));
	im.getClient().getSession().write(Packages.tools.packet.MaplePacketCreator.serverNotice(6, "角色獲得了新的騎獸技能"));
	im.dispose();
}