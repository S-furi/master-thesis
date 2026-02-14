interface Observable<T> : Disposable {
	fun onChange(registrant: Any, doOnNext: (T) -> Unit)
	fun stopWatching(registrant: Any)
}
