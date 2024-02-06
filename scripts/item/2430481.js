/*
	名字:	傳說的奇幻方塊碎片
	地圖:	傳說的奇幻方塊碎片
	描述:	特殊消耗品
*/

function start() {
	if (im.getPlayer().itemQuantity(2430481) < 10) {
		im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "收集10個傳說的奇幻方塊碎片，可以製作一個傳說方塊"));
		im.dispose();
		return;
		}
	if (im.getPlayer().getInventory(Packages.client.inventory.MapleInventoryType.CASH).getNumFreeSlot() < 1) {
		im.getClient().getSession().write(Packages.tools.packet.CWvsContext.serverNotice(6, "製作傳說方塊之前，請在特殊欄保留一個空位"));
		im.dispose();
		return;
		}
		im.gainItem(2430481, -10);
		im.gainItem(5062002, 1);
		im.dispose();
}