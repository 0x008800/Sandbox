public class StaticField{
	public static final StaticField INSTANCE = new StaticField();
}

/*
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 *
 */

