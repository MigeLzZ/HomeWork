package by.htp.lsn12.logic;

import by.htp.lsn12.entity.Catalog;

public interface LibrarianOperation {  // ������� ���������� - ��� ��������� (����� ����������� ��� ����).
	
	public static final double PI = 3.14;  // public static final - � ���������� � ����� �� ���������, ����� �� ������.
	double PI2 = 6.28;

	public abstract Catalog viewCatalog();  // � ���������� ������� ��������� ������ public ��� � ����� ��� � � �������.
	Catalog viewCatalog2();  // ��� ������ � ���������� �����������, �.�. �� �������� ���� � ���������, �� ����� ��� ����� �� ������.
	
}
