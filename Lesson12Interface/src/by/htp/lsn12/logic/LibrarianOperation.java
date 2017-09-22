package by.htp.lsn12.logic;

import by.htp.lsn12.entity.Catalog;

public interface LibrarianOperation {  // Вершина абстракции - это интерфейс (самое абстрактное что есть).
	
	public static final double PI = 3.14;  // public static final - в интерфейсе у полей по умолчанию, можно не писать.
	double PI2 = 6.28;

	public abstract Catalog viewCatalog();  // В интерфейсе область видимости всегда public как у полей так и у методов.
	Catalog viewCatalog2();  // Все методы в интерфейса абстрактные, т.е. не содержат тело и публичные, по этому это можно не писать.
	
}
