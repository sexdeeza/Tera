
function enter(pi) {
	if (pi.getPlayer().getInfoQuest(22013).indexOf("mo20=o") != -1) {
		return false;
		}
		pi.getPlayer().updateInfoQuest(22013, pi.getPlayer().getInfoQuest(22013) + ";mo20=o");
		pi.getClient().getSession().write(Packages.tools.packet.CField.EffectPacket.AranTutInstructionalBalloon("Effect/OnUserEff.img/guideEffect/evanTutorial/evanBalloon20"));
		return true;
}