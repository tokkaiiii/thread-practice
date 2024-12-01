package thread.executor

import thread.util.log
import java.util.concurrent.ExecutorService
import java.util.concurrent.ThreadPoolExecutor

fun printState(executorService: ExecutorService) {
    if (executorService is ThreadPoolExecutor){
        val pool = executorService.poolSize
        val active = executorService.activeCount
        val queuedTasks = executorService.queue.size
        val completedTask = executorService.completedTaskCount
        log("[pool=$pool, active=$active, queuedTasks=$queuedTasks, completedTask=$completedTask]")
    }else{
        log(executorService)
    }
}