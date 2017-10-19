package org.hejwo.java9.defaultmethods;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public interface HighAbstraction {

    private void foo() {
        System.out.println("This will never change");
    }

    private static void foo2() {

        Flow.Publisher<String> publisher = new SubmissionPublisher<>();
        Flow.Subscriber<String> subscriber = null;
        Flow.Processor<String, Integer> processor = null;
        Flow.Subscription subscription = null;

    }

}
