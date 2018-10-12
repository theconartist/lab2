/*
    Programming for Computer Scientists (CS118) - Lab 2
    Variables and basic types
*/

/* This class contains methods related to calculations
   involving percentages. */
public class Lab2 {
    // this method should calculate what percentage
    // the thisMany argument is of thatMany
    public float percentageOf(float thisMany, float thatMany) {
        // TODO: implement
        return (thisMany / thatMany) * 100;
    }

    // this method should calculate the overall module mark
    // for CS118 based on the individual marks for the first
    // coursework, the second coursework, and the exam (all out
    // of 100) knowing that the weights of the components are
    // 15, 25, and 60 respectively.
    public float overallModuleMark(float cswk1, float cswk2, float exam) {
        // TODO: implement
        return cswk1 * 0.15f + cswk2 * 0.25f + exam * 0.6f;
    }

    // this method should calculate the required exam mark needed
    // to achieve a desired overall module mark, given the marks
    // for the first and second coursework.
    public float desiredExamMarkToAchieve(float cswk1, float cswk2, float moduleMark) {
        float moduleMarksSoFar = overallModuleMark(cswk1, cswk2, 0);
        float moduleMarksNeeded = moduleMark - moduleMarksSoFar;
        return percentageOf(moduleMarksNeeded, 60);
    }

    // this method should calculate the mark that is needed for
    // the third component of some assessment, given the marks for the
    // first two components as well as the weights of all components and
    // the desired overall mark
    public float markToAchieve(float c1, float w1, float c2, float w2, float overall) {
        float componentMarksSoFar = c1 * (w1 / 100) + c2 * (w2 / 100);
        float componentMarksNeeded = overall - componentMarksSoFar;
        return percentageOf(componentMarksNeeded, 100 - w1 - w2);
    }
}
