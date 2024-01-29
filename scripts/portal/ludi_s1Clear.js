function enter(pi) {
	var eim = pi.getPlayer().getEventInstance();
	if (eim.getProperty("stage1") == null) {
		return false;
		}
		map = pi.getPlayer().getMap().getId() + 300; //遺棄之塔&amp;lt;第2階段&gt;
		pi.getPlayer().changeMap(922010400);
		return true;
}