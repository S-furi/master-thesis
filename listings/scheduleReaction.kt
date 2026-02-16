private fun scheduleReaction(reaction: Actionable<T>) {
    // 1. Initial scheduling
    reaction.initializationComplete(time, environment)
    scheduler.addReaction(reaction)

    // 2. Reactive binding: The Engine listens, it does not poll.
    reaction.rescheduleRequest.onChange(this, false) {
        updateReaction(reaction)
    }
}
