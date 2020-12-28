package org.copydays.rmliu;

public interface TimerBigInterfaca {

    interface TimerClient {
        void timeout(int timeoutID);
    }
//    interface TimerClient {
//        void timeout();
//    }

    interface Door extends TimerClient {
        void lock();

        void unlock();

        boolean isDoorOpen();
    }

    class Timer {
        public void register(int timeout, int timeoutID, TimerClient client) {
            // ....
        }
    }
//    class Timer {
//        void register(int timeout, TimerClient client) {
//            // ....
//        }
//    }
}

