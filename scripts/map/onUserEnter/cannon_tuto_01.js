
function start() {
	ms.getClient().getSession().write(Packages.tools.packet.CField.UIPacket.IntroEnableUI(1));
	ms.getPlayer().changeSingleSkillLevel(Packages.client.SkillFactory.getSkill(110), 1, 1, -1);
	ms.dispose();
	ms.openNpc(1096000);
}