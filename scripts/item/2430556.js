/*
	名字:	Maximus Mount 15 day coupon 
	地圖:	Maximus Mount 15 day coupon 
	描述:	騎乘技能
*/

function start() {
	im.gainItem(2430556, -1);
	im.getPlayer().changeSingleSkillLevel(Packages.client.SkillFactory.getSkill(80001195), 1, 1, im.getCurrentTime() + (15 * 24 * 60 * 60 * 1000));
	im.getClient().getSession().write(Packages.tools.packet.MaplePacketCreator.serverNotice(6, "角色獲得了新的騎獸技能"));
	im.dispose();
}