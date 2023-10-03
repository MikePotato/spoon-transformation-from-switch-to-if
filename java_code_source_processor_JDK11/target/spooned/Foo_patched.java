public class Foo_patched {
    public void testFromTask(int input, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
            {
                int expVal_3e3cd411f37349c481e9b1c033422918 = input;
                if (java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 0)) {
                    logger.append(input);
                    return;
                } else if (!java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 0) && !java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 6) && !java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 3) && !java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 1)) {
                    logger.append("DEFAULT");
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 3) || java.util.Objects.equals(expVal_3e3cd411f37349c481e9b1c033422918, 6)) {
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
            java.lang.String expVal_e0b3891b95bf4db2ac2a48920f668183 = getValue(logger);
        }
    }

    public int testColonSwitchWithReturns(int arg, java.lang.StringBuilder logger) {
        for (int i = 0; i < 10; i++) {
            {
                int expVal_83098a796726484a98885368052c9f71 = arg;
                if (java.util.Objects.equals(expVal_83098a796726484a98885368052c9f71, 1) || java.util.Objects.equals(expVal_83098a796726484a98885368052c9f71, 0)) {
                    logger.append(1);
                    return 1;
                } else if (java.util.Objects.equals(expVal_83098a796726484a98885368052c9f71, 2)) {
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
            java.lang.String expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba = arg;
            if (java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "1") || java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "0")) {
                logger.append(1);
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "2")) {
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (!java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "0") && !java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "1") && !java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "2") && !java.util.Objects.equals(expVal_d1b25f0b6f2945ae9e2dcb2b3dc037ba, "3")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testMostPrimitiveCase2(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_624aaea80e684593b32940646f491fef = arg;
            if (java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "1") || java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "0")) {
                logger.append(1);
                logger.append("default");
                logger.append(3);
            } else if ((!java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "0") && !java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "1") && !java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "2") && !java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "3")) || java.util.Objects.equals(expVal_624aaea80e684593b32940646f491fef, "2")) {
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
                int expVal_83603bc026dc4d3d9a74e0817c0bfe38 = i;
                if (!java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 1) && !java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 2) && !java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 3) && !java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 4)) {
                    logger.append("DEFAULT" + arg);
                    int expVal_26cb493454fc4a819cb009b91de25891 = i * 2;
                    if (java.util.Objects.equals(expVal_26cb493454fc4a819cb009b91de25891, 7) || java.util.Objects.equals(expVal_26cb493454fc4a819cb009b91de25891, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 1)) {
                    int expVal_26cb493454fc4a819cb009b91de25891 = i * 2;
                    if (java.util.Objects.equals(expVal_26cb493454fc4a819cb009b91de25891, 7) || java.util.Objects.equals(expVal_26cb493454fc4a819cb009b91de25891, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 3) || java.util.Objects.equals(expVal_83603bc026dc4d3d9a74e0817c0bfe38, 2)) {
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