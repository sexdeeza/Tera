
function start() {
	if (cm.getPlayer().getSubcategory() == 1) {
		cm.sendOk("��Ҫ��ĕr���ҕ�ϵ��ġ�");
		cm.dispose();
		return;
		}
	if (cm.getPlayer().getMap().getId() != 10000 || cm.getPlayer().getLevel() > 1) {
		cm.sendOk("�ߡ����᣿");
		cm.dispose();
		return;
		}
		var chat = "�٣���߅�ǂ�С���Л]���dȤ�����ҵĽM���ɞ�Ӱ���ߵ�һ�T�������@�e�Ⱥ���þ��ˣ��l�F����Н�����Ҫ��Ҫ���룿#b";
		chat += "\r\n#L0#��߀���^�m��ð�U��";
		chat += "\r\n#L1#����ɞ�Ӱ����";
		cm.sendSimple(chat);
}

function action(mode, type, selection) {
	switch (selection) {
	case 0:
		cm.sendOk("������x�_���@�e���͛]�п��ܳɞ�Ӱ�����ˣ�������м����롣");
		break;
	case 1:
		cm.getPlayer().setSubcategory(1);
		cm.getPlayer().fakeRelog();
		}
		cm.dispose();
}