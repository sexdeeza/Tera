function start() {
	if (ms.getPlayer().getEventInstance() != null && ms.getPlayer().getEventInstance().getProperty("boss") != null && ms.getPlayer().getEventInstance().getProperty("boss").equals("0")) {
		for (var i = 9800119; i < 9800125; i++) {
		boss = Packages.server.life.MapleLifeFactory.getMonster(i);
		}
		ms.getPlayer().getEventInstance().registerMonster(boss);
		ms.getPlayer().getMap().spawnMonsterOnGroundBelow(boss, new java.awt.Point(ms.getPlayer().getMap().getPortal(2).getPosition()));
		}
		ms.dispose();
}