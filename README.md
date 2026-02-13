# Master Thesis

## Index

- **Chapter 1: An introduction to Simulation**
    - **The importance of simulators in science** ✅
    - **Simulation and simulators**
        - **System modelling concepts** ✅
        - **Formal Definition of the Simulation Framework** ✅
    - **The Landscape of Simulation Formalisms**
        - **Time-Stepped Approaches** (Fixed Step DTSS) ✅
        - **Simulation through Differential Equations** (Continuous DESS) ✅
        - **Discrete Event Simulation** (DEVS) ✅
        - **Multi-Agent Based Simulation** (MABS, autonomy and emergence) ✅
        - **Deterministic and Stochastic Simulation** ✅
        - **Summary and conclusions** ✅

    - **Event Dependencies Management** ✅
        - SSA Optimisation by the Next Reaction Method ✅
        - Other Optimisations 
        - Limitations ⚠️

    - **Dependency Management in Parallel and Distributed Simulations**
        - Causality and simulation correctness ✅
        - Conservative Execution ✅
        - Speculative Execution ✅
        - Conservative vs. Speculative ✅

    - **Reactive Dependency Management: a proposal**
        - Reactive PDES ✅

    - **Motivations and Objectives**  ⚠️
        - **Towards Automatic Dependency Resolution through Reactive Execution**:
            - **Brief Introduction to the Reactive Paradigm**
            - **Benefits**
                - **Reduction of Cognitive Load (Developer Productivity)** in traditional
                    DES the modeler should track which state changes invalidate which future events.
                    A reactive engine moves this burden from the Human to the Framework.
                - **Consistency by Construction**
                - **Efficiency** in high density systems (e.g. MABS)
        - **Building a Fully-Reactive DES** by means of mofifying an existing simulator
            and assessing its correctness by making it run the existing test suite.

- **Chapter 2: Reactivity as Dependency Resolution Mechanism** ✅
    - **Theory of Reactive Systems** ✅
        - **Event-driven and Data-Flow computatoin** ✅
        - **Reactive Systems** ✅
        - **Observer pattern and push based propagation** ✅
        - **FRP** ✅

    - **Mechanics of Propagation** ✅
        - **Sycnhronous and Async propagation** ✅
        - **Push vs Pull updates** ✅

    - **Challenges in Reactive Frameworks Design**  ✅
        - **Ordering, consistency and glitches** ✅
        - **Resources and Lifecycle Management** ✅
        - **Performance Considerations** ✅
        - **Challenges in Distributed Environments** ✅

     - **Overview of Reactive Frameworks in JVM languages** ✅
        - **JavaRX** ✅
        - **Scala.React** ✅
        - **Akka** ✅
        - **Kotlin Flows** ✅
    - **Summary** ✅

- **Chapter 3: Designing a Reactive Architecture for Alchemist**
  - **Alchemist** ✅
        - **Architectural Overview** ✅
            - **Alchemist Metamodel** ✅
            - **Implementations and Applications (Incarnations)** ✅
        - **Dependency Management in Alchemist** ✅
  - **The Reactive Metamodel**
      - **Dependency Management in Alchemist's Engine** ✅
        - **On Explicit Dependency Graphs** ✅
      - **Towards an observable state** ✅
      - **Behaviour as a Composition of Event Streams** ✅
  - **Reactive Architecture Design Principles**
      - **Synchronous propagation for causal consistency** ✅
      - **push-based updates for sparsisty** ✅
      - **selective eager evealuation for scheduling** ✅
  - **Summary** ✅
    
- **Chapter 4: Implementation and Evaluation**
    - **The Reactive Framework**
        - **Core Abstractions**
        - **Memory Management Strategies**
        - **Ensuring Consistency**
    - **Integration into Alchemist**
        - **Integration Strategy**
        - **The Engine Simplification**
        - **The new Execution flow**
        - **Condition/Reaction Retrofitting**
        - **Incarnation Support**:
            - **Biochemistry**
            - **Protelis**
            - **Sapere & Scafi**
    - **Verification of Correctness**
        - **Assessing Correctness through Equivalence Testing**

    - **Performance Assessment**
        - **Throughput Analysis** through comparison
        - **Benchmarks**
        - **Memory Overhead**

- **Chapter 5: Conclusions**
    - **Summary of contributions**
        - Formalization of Reactive DES.
        - The Hybrid Eager/Lazy architecture. (? if implemented, theoretical foundations otherwise)
        - The working prototype.
    - **Limitations**
    - **Future works**
        - **Transactional Propagation** (which can be discussed above in analysis
        to be a concerning point for DES correctness, also for
        possibile PDES or distributed scenearions).
        - **Optimisations** memory/speed
