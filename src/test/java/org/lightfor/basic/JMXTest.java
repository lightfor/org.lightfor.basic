package org.lightfor.basic;

import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryManagerMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.ThreadMXBean;
import java.util.List;

/**
 * JMX test
 * Created by Light on 2017/6/26.
 */
public class JMXTest {

    @Test
    public void test1() throws InterruptedException {

        while (true) {


            List<MemoryManagerMXBean> memoryManagerMXBeans = ManagementFactory.getMemoryManagerMXBeans();
            for (MemoryManagerMXBean memoryManagerMXBean : memoryManagerMXBeans) {
                System.out.println(memoryManagerMXBean.getName());
            }
            List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
            for (GarbageCollectorMXBean garbageCollectorMXBean : garbageCollectorMXBeans) {
                System.out.println(garbageCollectorMXBean.getName());
                System.out.println(garbageCollectorMXBean.getCollectionCount());
                System.out.println(garbageCollectorMXBean.getCollectionTime());
            }
            MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
            MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
            MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
            System.out.println((double) heapMemoryUsage.getUsed() / heapMemoryUsage.getMax());
            System.out.println((double) nonHeapMemoryUsage.getUsed() / nonHeapMemoryUsage.getMax());

            List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();
            for (MemoryPoolMXBean memoryPoolMXBean : memoryPoolMXBeans) {
                System.out.println(memoryPoolMXBean.getName());
                System.out.println(memoryPoolMXBean.getUsage());
            }

            OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();

            System.out.println(operatingSystemMXBean.getSystemLoadAverage()); //always -1 for win 10 ?

            Thread.sleep(1000);

            ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
            System.out.println(threadMXBean.getThreadCount());

            break;
        }

    }
}
