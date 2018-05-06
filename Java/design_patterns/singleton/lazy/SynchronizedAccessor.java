public class SynchronizedAccessor{
	private static SynchronizedAccessor instance;

	public static synchronized SynchronizedAccessor getInstance(){
		if(instance == null){
			instance = new SyncronizedAccessor();
		}
		return instance;
	}
}

/* Synchronized Accessor 
 *
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее типичном доступе
 *
 */

