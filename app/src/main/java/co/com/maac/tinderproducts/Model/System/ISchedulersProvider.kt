package co.com.maac.tinderproducts.Model.System

import io.reactivex.Scheduler

interface ISchedulersProvider {
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun trampoline(): Scheduler
    fun newThread(): Scheduler
    fun io(): Scheduler
}