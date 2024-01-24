function start() {
	switch (ms.getPlayer().getMap().getId()) {
	case 103000800:
        c.getPlayer().getMap().startMapEffect("Solve the question and gather the amount of passes!", 5120017);
        break;
    case 103000801:
        c.getPlayer().getMap().startMapEffect("Get on the ropes and unveil the correct combination!", 5120017);
        break;
    case 103000802:
        c.getPlayer().getMap().startMapEffect("Get on the platforms and unveil the correct combination!", 5120017);
        break;
    case 103000803:
        c.getPlayer().getMap().startMapEffect("Get on the barrels and unveil the correct combination!", 5120017);
        break;
    case 103000804:
        c.getPlayer().getMap().startMapEffect("Defeat King Slime and his minions!", 5120017);
        break;
		}
		ms.dispose();
}