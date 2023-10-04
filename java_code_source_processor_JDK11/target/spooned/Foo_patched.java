public class Foo_patched {
    public void testFromTask(int input, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
            {
                int expVal_9d784782ac324d22adef23908b48f5b8 = input;
                if (java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 0)) {
                    logger.append(input);
                    return;
                } else if (!java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 0) && !java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 6) && !java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 3) && !java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 1)) {
                    logger.append("DEFAULT");
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 3) || java.util.Objects.equals(expVal_9d784782ac324d22adef23908b48f5b8, 6)) {
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else {
                    logger.append(input);
                }
            }
        }
        logger.append("AFTER");
    }

    public java.lang.String getValue(java.lang.StringBuilder logger) {
        logger.append("getValue is called");
        return "";
    }

    public void testEmptyCase(int input, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_f2c5ce2947e84d65bde6919a171fa4bf = getValue(logger);
        }
    }

    public int testColonSwitchWithReturns(int arg, java.lang.StringBuilder logger) {
        for (int i = 0; i < 10; i++) {
            {
                int expVal_4ae1ce3944484c21bb25d555419324be = arg;
                if (java.util.Objects.equals(expVal_4ae1ce3944484c21bb25d555419324be, 1) || java.util.Objects.equals(expVal_4ae1ce3944484c21bb25d555419324be, 0)) {
                    logger.append(1);
                    return 1;
                } else if (java.util.Objects.equals(expVal_4ae1ce3944484c21bb25d555419324be, 2)) {
                    logger.append(2);
                    return 2;
                } else {
                    logger.append(0);
                    return 0;
                }
            }
        }
        logger.append(100);
        return 100;
    }

    public void testMostPrimitiveCase(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_a7cf3667c203487ca16b1ab9c4822702 = arg;
            if (java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "1") || java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "0")) {
                logger.append(1);
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "2")) {
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (!java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "0") && !java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "1") && !java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "2") && !java.util.Objects.equals(expVal_a7cf3667c203487ca16b1ab9c4822702, "3")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testMostPrimitiveCase2(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_507dc77190b14a13bbc39783914f3e16 = arg;
            if (java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "1") || java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "0")) {
                logger.append(1);
                logger.append("default");
                logger.append(3);
            } else if ((!java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "0") && !java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "1") && !java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "2") && !java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "3")) || java.util.Objects.equals(expVal_507dc77190b14a13bbc39783914f3e16, "2")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testColonSwitchStatement(int arg, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int i = 0; i < 10; i++) {
            {
                int expVal_e828feff93144282861fe662f1bc670e = i;
                if (!java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 1) && !java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 2) && !java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 3) && !java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 4)) {
                    logger.append("DEFAULT" + arg);
                    int expVal_97975fa00c8744d383bbf935a61880bc = i * 2;
                    if (java.util.Objects.equals(expVal_97975fa00c8744d383bbf935a61880bc, 7) || java.util.Objects.equals(expVal_97975fa00c8744d383bbf935a61880bc, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 1)) {
                    int expVal_97975fa00c8744d383bbf935a61880bc = i * 2;
                    if (java.util.Objects.equals(expVal_97975fa00c8744d383bbf935a61880bc, 7) || java.util.Objects.equals(expVal_97975fa00c8744d383bbf935a61880bc, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 3) || java.util.Objects.equals(expVal_e828feff93144282861fe662f1bc670e, 2)) {
                    logger.append("2 or 3");
                    logger.append("4");
                } else {
                    logger.append("4");
                }
            }
        }
        logger.append("AFTER");
    }
}