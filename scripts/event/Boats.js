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
    closeTime = em.getTransportationTime(closeTime);
    beginTime = em.getTransportationTime(beginTime);
    rideTime = em.getTransportationTime(rideTime);
    invasionStartTime = em.getTransportationTime(invasionStartTime);
    invasionDelayTime = em.getTransportationTime(invasionDelayTime);
    
    Orbis_btf = em.getChannelServer().getMapFactory().getMap(200000112);
    Ellinia_btf = em.getChannelServer().getMapFactory().getMap(104020111);
    Boat_to_Orbis = em.getChannelServer().getMapFactory().getMap(200090010);
    Boat_to_Ellinia = em.getChannelServer().getMapFactory().getMap(200090000);
    Orbis_Boat_Cabin = em.getChannelServer().getMapFactory().getMap(200090011);
    Ellinia_Boat_Cabin = em.getChannelServer().getMapFactory().getMap(200090001);
    Ellinia_docked = em.getChannelServer().getMapFactory().getMap(104020110);
    Orbis_Station = em.getChannelServer().getMapFactory().getMap(200000100);
    Orbis_docked = em.getChannelServer().getMapFactory().getMap(200000111);
    
    Ellinia_docked.setDocked(true);
    Orbis_docked.setDocked(true);
    Boat_to_Orbis.setDocked(false);
    Boat_to_Ellinia.setDocked(false);
    scheduleNew();
}

function scheduleNew() {
    em.setProperty("docked", "true");
    
    em.setProperty("entry", "true");
    em.setProperty("haveBalrog", "false");
    em.schedule("stopentry", closeTime);
    em.schedule("takeoff", beginTime);
}

function stopentry() {
    em.setProperty("entry","false");
    Orbis_Boat_Cabin.resetReactors();   //boxes
    Ellinia_Boat_Cabin.resetReactors();
}

function takeoff() {
    Orbis_btf.warpEveryone(Boat_to_Ellinia.getId());
    Ellinia_btf.warpEveryone(Boat_to_Orbis.getId());
    
    Ellinia_docked.broadcastShip(false);
    Orbis_docked.broadcastShip(false);
    
    em.setProperty("docked","false");
    
    if(Math.random() < 0.42) em.schedule("approach", (invasionStartTime + (Math.random() * invasionDelayTime)));
    em.schedule("arrived", rideTime);
}

function arrived() {
    Boat_to_Orbis.warpEveryone(Orbis_Station.getId(), 0);
    Orbis_Boat_Cabin.warpEveryone(Orbis_Station.getId(), 0);
    Boat_to_Ellinia.warpEveryone(Ellinia_docked.getId(), 1);
    Ellinia_Boat_Cabin.warpEveryone(Ellinia_docked.getId(), 1);
    Orbis_docked.broadcastShip(true);
    Ellinia_docked.broadcastShip(true);
    Boat_to_Orbis.broadcastBalrogShip(false);
    Boat_to_Ellinia.broadcastBalrogShip(false);
    Boat_to_Orbis.killAllMonsters(false);
    Boat_to_Ellinia.killAllMonsters(false);
    em.setProperty("haveBalrog", "false");
    scheduleNew();
}

function approach() {
    if (Math.floor(Math.random() * 10) < 10) {
        em.setProperty("haveBalrog","true");
        Boat_to_Orbis.broadcastBalrogShip(true);
        Boat_to_Ellinia.broadcastBalrogShip(true);
        //Boat_to_Orbis.broadcastMessage(Packages.tools.packet.CField.InteractionPacket.musicChange("Bgm04/ArabPirate")); plays music already so not needed
        //Boat_to_Ellinia.broadcastMessage(Packages.tools.packet.CField.InteractionPacket.musicChange("Bgm04/ArabPirate")); plays music already so not needed
        
        em.schedule("invasion", invasionDelay);
    }
}

function invasion() {
    var map1 = Boat_to_Ellinia;
    var pos1 = new java.awt.Point(-538, 143);
    map1.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos1);
    map1.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos1);

    var map2 = Boat_to_Orbis;
    var pos2 = new java.awt.Point(339, 148);
    map2.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos2);
    map2.spawnMonsterOnGroundBelow(em.getMonster(8150000), pos2);
}

function cancelSchedule() {
    
}