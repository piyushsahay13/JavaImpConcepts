# Deadlock Program

Thread t1 starts and calls test1 method by taking the object lock of s1.
Thread t2 starts and calls test1 method by taking the object lock of s2.
t1 prints test1-begin and t2 prints test-2 begin and both waits for 1 second, so that both threads can be started if any of them is not.
t1 tries to take object lock of s2 and call method test2 but as it is already acquired by t2 so it waits till it become free. It will not release lock of s1 until it gets lock of s2.
Same happens with t2. It tries to take object lock of s1 and call method test1 but it is already acquired by t1, so it has to wait till t1 release the lock. t2 will also not release lock of s2 until it gets lock of s1.
Now, both threads are in wait state, waiting for each other to release locks. Now there is a race around condition that who will release the lock first.
As none of them is ready to release lock, so this is the Dead Lock condition.
When you will run this program, it will be look like execution is paused.
