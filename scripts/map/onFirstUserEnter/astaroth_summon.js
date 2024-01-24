function start() {
	ms.getPlayer().getMap().resetFully();
	ms.getPlayer().getMap().spawnMonsterOnGroundBelow(Packages.server.life.MapleLifeFactory.getMonster(9400633), new java.awt.Point(600, -26));
	ms.dispose();
}