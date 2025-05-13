public int dogWalkShift(int startHour, int endHour) {
    result = 0;
    for (int i = startHour; i <= endHour; i++) {
        dawgs = walkDogs(i);
        if (dawgs == maxDogs || (i >= 9 && i <= 17)) {
            result += 3;
        }
        result += (5 * dawgs);
    }
    return result;
}
