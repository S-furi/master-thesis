private var _isValid: Boolean = false
init {
    node.observeConcentration(target).onChange(this) {
        _isValid = it > threshold
    }
}
fun isValid(): Boolean = _isValid
