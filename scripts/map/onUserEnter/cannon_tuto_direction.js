
function start() {
	ms.getClient().getSession().write(Packages.tools.packet.CField.UIPacket.IntroEnableUI(1));

	ms.getClient().getSession().write(Packages.tools.packet.CField.EffectPacket.ShowWZEffect("Effect/Direction4.img/cannonshooter/Scene00"));
	ms.getClient().getSession().write(Packages.tools.packet.CField.EffectPacket.ShowWZEffect("Effect/Direction4.img/cannonshooter/out00"));
	ms.dispose();
}