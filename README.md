<!---

TASK LIST:

  * Use cp -rf *.* to copy all of the files and directories in this repository
    to the starter repository for this assignment
  * Change into the directory for the starer repository
  * Update the header (e.g., #) to only give the name of the assignment
  * Update the first paragraph to include the commented-out content
  * Change the link in the # Problems section to point to this lab's starter
  * Create the assignment in the GitHub Classroom, noting the URL
  * Test the assignment by accepting it with your own GitHub account
  * Check to ensure that your GitHub repository is created correctly
  * Share the assignment link with all of the students using email or Slack

PROBLEMS?

  * Contact Gregory M. Kapfhammer by email or Slack
  * Raise an issue in the GitHub repository for this assignment

-->

# cs101-F2018-lab7-starter

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for Laboratory 7 in Computer Science 101. Since
the Travis builds for this repository will initially fail (as evidenced by a
red &#x2717; appearing in the commit logs instead of a green &#x2714;), the
programmer is responsible for completing all of the steps needed to satisfy the
requirements for the assignment, thus causing a &#x2714; to instead appear in
the commit logs.

## Introduction

This assignment requires a programmer to implement and test a benchmarking
framework that supports the empirical evaluation of `IterativeFibonacci` and
`RecursiveFibonacci`. More details about recursive algorithms are provided in
Sections 5.1 through 5.5, with Section 5.5 specifically furnishing specific
details about the `RecursiveFibonacci` method. You can also learn about
experimental studies by reviewing the content in Sections 4.1 through 4.3.
Please note that this assignment will also require you to read and use Java
classes that contain a test suite. Also, you can learn more about iterative
algorithms by reviewing Section 1.5.2. Finally, the programmer is also
responsible for learning how to run and extend a test suite written in the JUnit
testing framework, as explained in Section 1.9. As verified by
[Checkstyle](https://github.com/checkstyle/checkstyle), the source code for all
of the Java classes must adhere to all of the requirements in the [Google Java
Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmer is also responsible for writing a reflection, stored in the file
`writing/reflection.md`, that responds to the questions in the assignment sheet
and explains the challenges that you faced and the solutions you developed.
Please note that this is a Markdown file that must adhere to the standards
described in the [Markdown Syntax
Guide](https://guides.github.com/features/mastering-markdown/). Remember, you
can preview the contents of a comitted Markdown file by clicking on the name of
the file in your GitHub repository. Finally, don't forget that your
`writing/reflection.md` file should adhere to the Markdown standards established
by the [Markdown linting tool](https://github.com/markdownlint/markdownlint) and
the writing standards set by the [Proselint tool](http://proselint.com/).

The source code in the submitted Java source code files must also pass
additional tests set by the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader). For instance, GatorGrader
will check to ensure that `Experiment` and `RunCampaign` have `println`
statements that can produce the output from running a campaign of experiments.
Gradle will also run a JUnit test suite that will perform many checks on your
implementation of the Java classes. More details about the GatorGrader checks
are included later in this document and in the assignment sheet.

When you use the `git commit` command to transfer your source code to your
GitHub repository, [Travis CI](https://travis-ci.com/) will initialize a build
of your assignment, checking to see if it meets all of the requirements. If both
your source code and writing meet all of the established requirements, then you
will see a green &#x2714; in the listing of commits in GitHub. If your
submission does not meet the requirements, a red &#x2717; will appear instead.
The instructor will reduce a programmer's grade for this assignment if the red
&#x2717; appears on the last commit in GitHub immediately before the
assignment's due date.

A carefully formatted assignment sheet for this project provides more details
about the steps that a computer scientist should take to complete this
assignment. You can view this assignment sheet by visiting the listing of
laboratories on the course web site.

## Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com)
and [GitHub Classroom](https://classroom.github.com/).

To do well on this assignment, you should also Section 1.5.2 to learn more about
iteration constructs. You should also review Sections 4.1 to 4.3, focusing on
the content that explains the steps of both an analytical and empirical
evaluation of an algorithm. To learn more about recursion, please read Sections
5.1 through 5.5, focusing on Section 5.1's introduction to recursion and Section
5.5's Code Fragment 5.13 that explains the `RecursiveFibonacci` algorithm.
Please see the course instructor or one of the teaching assistants or tutors if
you have questions about any of these reading assignments.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `gradle grade` in your terminal.
Running this command will produce a lot of output that you should carefully
inspect. If the output indicates that GatorGrader judges that there are no
mistakes in the assignment, then this means that your source code and writing
are passing all of the automated baseline checks. However, if the output
indicates that there are mistakes, then you will need to understand what they
are and then try to fix them.

Running this command will produce a lot of output that you should carefully
inspect. If the last lines of the output indicates that GatorGrader judges that
there are no mistakes in the assignment, then this means that your source code
and writing are passing all of the automated checks. However, if the last line
of the output indicates that there are mistakes, then you will need to
understand what they are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are also additional commands that you can type:

- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle cleanTest`: clean the JUnit test suite of derived files
- `gradle test`: run the JUnit test suite and produce report
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the home directory for this
assignment where the `build.gradle` file is located. Then, you can type the
command in the terminal and study the output.

## Output

Typing the command `gradle run` in the terminal window produces the following
output for the instructor's version of `labseven.experiment.Experiment`.
Critically, the timing values and order of growth ratios may be different when
you run the experiment on your own computer. You should also see that the
`IterativeFibonacciComputation` is run for more rounds than is the
`RecursiveFibonacciComputation`. Why is that the case? Make sure that you try to
run the `RecursiveFibonacciComputation` in an experiment campaign that lasts for
at least one more round than is the current default. Finally, please note that
this laboratory assignment invites you to run a comprehensive JUnit test suite
of multiple Java classes in multiple packages. While this test suite does not
produce any output, you should carefully inspect its tests so that you
understand their strategy.

```
Starting a campaign of experiments with IterativeFibonacciComputation ...
  Running round 0 with input size 1
  Running round 1 with input size 2
  Running round 2 with input size 4
  Running round 3 with input size 8
  Running round 4 with input size 16
  Running round 5 with input size 32
  Running round 6 with input size 64
  Running round 7 with input size 128
  Running round 8 with input size 256
  Running round 9 with input size 512
  Running round 10 with input size 1024
  Running round 11 with input size 2048
  Running round 12 with input size 4096
  Running round 13 with input size 8192
  Running round 14 with input size 16384
  Running round 15 with input size 32768
  Running round 16 with input size 65536
  Running round 17 with input size 131072
  Running round 18 with input size 262144
  Running round 19 with input size 524288
  Running round 20 with input size 1048576
  Running round 21 with input size 2097152
  Running round 22 with input size 4194304
... Finishing a campaign of experiments with IterativeFibonacciComputation

Results of an experiment campaign with IterativeFibonacciComputation:

Size (#)        Timing (ms)     Ratio (#)
1               0               0
2               0               0
4               0               0
8               0               0
16              0               0
32              0               0
64              0               0
128             0               0
256             0               0
512             0               0
1024            0               0
2048            0               0
4096            0               0
8192            1               0
16384           0               0
32768           1               0
65536           2               2
131072          1               1
262144          1               1
524288          1               1
1048576         1               1
2097152         1               1
4194304         2               2

Starting a campaign of experiments with RecursiveFibonacciComputation ...
  Running round 0 with input size 1
  Running round 1 with input size 2
  Running round 2 with input size 4
  Running round 3 with input size 8
  Running round 4 with input size 16
  Running round 5 with input size 32
... Finishing a campaign of experiments with RecursiveFibonacciComputation

Results of an experiment campaign with RecursiveFibonacciComputation:

Size (#)        Timing (ms)     Ratio (#)
1               0               0
2               0               0
4               0               0
8               0               0
16              0               0
32              13              0
```

## Checking

In addition to making the checks that are mentioned in the introduction to this
document, your final submission must meet the following requirements.

- labseven/Experiment.java:
  - Contains at least two multi-line comments in the JavaDoc standard
  - Contains exactly 8 `println` statements to produce program output
  - Contains exactly zero of the comment fragment that marks incomplete tasks
  - Runs correctly without crashing or producing an error

- labseven/RunCampaign.java:
  - Contains at least four multi-line comments in the JavaDoc standard
  - Contains exactly 3 `println` statements to produce program output
  - Contains exactly zero of the comment fragment that marks incomplete tasks

- writing/reflection.md:
  - Passes the checks performed by the Markdown linting tool
  - Passes the checks performed by the Prose linting tool
  - Contains exactly five contiguous paragraphs of formatted text
  - Each of the contiguous paragraphs contains at least 100 words

- GitHub repository:
  - Contains Java source code that passes all of the provided JUnit tests
  - Contains five commits beyond the repository's starting number of commits

## Updates

If the course instructor updates the provided material for this assignment and
you would like to receive these updates, then you can type this command in the
main directory for this assignment:

```
./gatorgrader.sh --update git@github.com:Allegheny-Computer-Science-101-F2018/cs101-F2018-lab7-starter.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
git pull download master
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
the checking programs every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository, and the course instructor enables Travis for it. If
you are using Travis for the first time, you will need to authorize Travis CI to
access the private repositories that you created on GitHub.

## Requirements

The GatorGrader software that supports the checking of this assignment was
developed for the following software and versions:

- Gradle 4.6
- Java 1.8.0
- JUnit 4.9.0
- MDL 0.4.0
- Proselint 0.8.0
- Python 3.6

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 101 Lab 7
Starter](https://github.com/Allegheny-Computer-Science-101-F2018/cs101-F2018-lab7-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
you assignment, then you can follow the aforementioned steps to create an issue
in its repository. To ensure that your issue is properly resolved, please
provide as many details as is possible about the problem that you experienced.
If you discover a problem with the laboratory assignment sheet, then please
raise an issue in the
[cs101-F2018-sheets](https://github.com/Allegheny-Computer-Science-101-F2018/cs101-F2018-sheets)
repository and mention this assignment.

Students who find, and use the appropriate GitHub issue tracker to correctly
document, a mistake in any aspect of this laboratory assignment will receive
free laptop stickers and extra credit towards their grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack team for this course.
Finally, you can schedule a meeting during the course instructor's office hours.
