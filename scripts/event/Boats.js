importPackage(Packages.client);
importPackage(Packages.tools.packet.CField.InteractionPacket);
importPackage(Packages.server.maps);

var Orbis_btf;
var Boat_to_Orbis;
var Orbis_Boat_Cabin;
var Orbis_docked;
var Ellinia_btf;
var Ellinia_Boat_Cabin;
var Ellinia_docked;

//Time Setting is in millisecond
var closeTime = 4 * 60 * 1000; //The time to close the gate
var beginTime = 5 * 60 * 1000; //The time to begin the ride
var rideTime = 10 * 60 * 1000; //The time that require move to destination
var invasionStartTime = 3 * 60 * 1000; //The time to balrog ship approach
var invasionDelayTime = 1 * 60 * 1000; //The time to balrog ship approach
var invasionDelay = 5 * 1000; //The time that spawn balrog

function init() {
	scheduleNew();
}

function scheduleNew() {
	em.setProperty("docked", "true");
	em.setProperty("entry", "true");
	em.setProperty("haveBalrog", "false");
	em.schedule("stopentry", 240000); //The time to close the gate [4 min]
	em.schedule("takeoff", 300000); // The time to begin the ride [5 min]

	em.getMapFactory().getMap(200090000).killAllMonsters(false);
	em.getMapFactory().getMap(200090010).killAllMonsters(false);
}

function stopentry() {
	em.setProperty("entry", "false");
	em.getMapFactory().getMap(200090011).resetReactors();
	em.getMapFactory().getMap(200090001).resetReactors();
}

function takeoff() {
	em.setProperty("docked", "false");
    em.warpAllPlayer(200000112, 200090000);
    em.warpAllPlayer(104020111, 200090010);
    em.schedule("invasion", 60000); // Time to spawn Balrog [1 min]
	em.schedule("arrived", 420000); // The time that require move to destination [7 min]
}

function arrived() {
	em.warpAllPlayer(200090010, 200000100);
	em.warpAllPlayer(200090011, 200000100);
	em.warpAllPlayer(200090000, 104020110);
	em.warpAllPlayer(200090001, 104020110);
	em.getMapFactory().getMap(200090010).killAllMonsters(false);
	em.getMapFactory().getMap(200090000).killAllMonsters(false);
	em.setProperty("haveBalrog", "false");
	scheduleNew();
}

function invasion() {
	if (Math.floor(Math.random() * 10) < 10) {
		var map1 = em.getMapFactory().getMap(200090000);
		var pos1 = new java.awt.Point(-538, 143);
		map1.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos1);
		map1.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos1);

		var map2 = em.getMapFactory().getMap(200090010);
		var pos2 = new java.awt.Point(339, 148);
		map2.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos2);
		map2.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos2);

		em.setProperty("haveBalrog", "true");
}
}

function cancelSchedule() {}