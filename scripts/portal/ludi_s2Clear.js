function enter(pi) {
	var eim = pi.getPlayer().getEventInstance();
	if (eim.getProperty("stage2") == null) {
		return false;
		}
		map = pi.getPlayer().getMap().getId() + 200; //遺棄之塔&amp;lt;第3階段&gt;
		pi.getPlayer().changeMap(pi.getMap(map), pi.getMap(map).getPortal(0));
		return true;
}