package com.javachobo.inter;

public class Fight extends Unit implements Fightable { // Interface ��� // 2.4
	// Interface�� ����� ���� ����� �����ϳ�, �Ϲ������δ� ���� �������̽��� ����ϴ� �ϳ��� �������̽��� ����Ѵ�.

	@Override
	public String send(int x) {
		return "�� �����ϱ�";
	}
	
	@Override
	public void move() {
		System.out.println("�̵� ��");
	}
	
}
