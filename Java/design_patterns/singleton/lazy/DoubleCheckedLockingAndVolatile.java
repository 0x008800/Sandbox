public class DoubleCheckedLockingAndVolatile{
	private static volatile DoubleCheckedLockingAndVolatile instance;

	public static DoubleCheckedLockingAndVolatile getInstance(){
		DoubleCheckedLockingAndVolatile localInstance = instance;
		if(localInstance == null){
			synchronized (DoubleChekedLockingAndVolatile.class){
				localInstance = instance;
				if(localInstance == null){
					instance = localInstance = new DoubleCheckedLockingAndVolatile();
				}
			}
		}
		return localInstance;
	}
}

/*
 * Double Checked Locking & volatile
 *
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5 
 *
 */


