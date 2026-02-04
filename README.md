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

    - **Discrete Event Simulation Execution Paradigms**
        - *Ordered-Pull-based Approach*
            - **The case of SSA**
        - *Constrained-Pull Approach* Conservative PDES
        - *Speculative-Repair Approach* Speculative PDES
        - **Event-Driven Approach** new solution

    - **Motivations and Objectives**
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

- **Chapter 2: Reactivity as Dependency Resolution Mechanism**
    - **Theory of Reactive Systems**
        - **Event-driven/Data-flow applications** (Lee and Messerschmitt "Fran")
        - **The reactive Manifesto** the drivers
            - **Reactive Principles** rigorous definitions
        - **FRP** extensions
        - **Project Reactor**

    - **Mechanics of Propagation**
        - **Sycnhronous and Async propagation**
        - **Observer Pattern**
        - **Signls/Pull-based/Lazy execution**
        - **Flows**

    - **Evaluation Strategies: Eager vs. Lazy** or Demand-driven vs. Data-driven
        - **Eager Push** (The ReactiveX/Observer Model)
        - **Lazy Derivations** (The MobX/Dirty-bit Model)
        - **Complexity Analysis**

    - **Challenges in Reactive Frameworks Design** 
        - **Glitches and Unsafe Dependencies Avoidance** (i.e. preventing redundant recomputations, cyclic deps, ...)
        - **Memory and Lifecycle Management**
        - **Performance Pitfalls**
        - **Challenged in Distributed Environments** see Salvaneschi works (open research issue)

    - **Comparison and Synthesis**
        - **Overview of Reactive Frameworks**
            - **Industry Standard**
                - **JavaRX**
                - **Kotlin Flows**
            - **In-house solution**
        - **DES requirements** (why a custom lightweight cps-like approach could fit best)
        - **The Hybrid Proposal** (i.e.eager rescheduling w/ lazy data propagation to grant DES correctness)


- **Chapter 3: Designing a Reactive Architecture for Alchemist**
    - **Alchemist**
        - **Architectural Overview**
            - **Alchemist Metamodel**A
            - **Implementations and Applications (Incarnations)**
        - **Dependency Management in Alchemist**
    - **The Reactive Metamodel**
        - **From state to Observables**
        - **From Logic to Derivation** i.e. explain how conditions can be
        expressed in terms of compositions and manipulations of
        observables/data flows.
            - **Overview of Operator Algebra**
        - **From explicit scheduling to Reaction** i.e. reactions and how the
        control loop is inverted wrt engine.

    - **The hybrid Execution Strategy**
        - **Eager Scheduling**
        - **Opportunities for Lazy Context Evaluation** (e.g. state could be
        lazy until explicitly requested).

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
