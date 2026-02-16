interface Observable<T> : Disposable {
	val current: T
	val observers: List<Any>
	fun onChange(registrant: Any, doOnNext: (T) -> Unit)
	fun stopWatching(registrant: Any)
}
