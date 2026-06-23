package com.rahmat.mentalhealthcare;

public class MentalHealthRFModel {
    public static double[] score(double[] input) {
        double[] var0;
        if (input[30] <= 0.5) {
            if (input[31] <= 0.5) {
                if (input[0] <= 0.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[19] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var0 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[40] <= 0.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.2, 0.8, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var0 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[36] <= 0.5) {
                    var0 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[19] <= 0.5) {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[3] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[37] <= 0.5) {
                                    var0 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 0.5) {
                                if (input[2] <= 0.5) {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var1;
        if (input[30] <= 0.5) {
            if (input[38] <= 0.5) {
                if (input[24] <= 0.5) {
                    if (input[37] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var1 = new double[] {0.2, 0.8, 0.0};
                    }
                } else {
                    if (input[37] <= 0.5) {
                        if (input[35] <= 0.5) {
                            if (input[33] <= 0.5) {
                                var1 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var1 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[35] <= 0.5) {
                            var1 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[20] <= 0.5) {
                var1 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[2] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[33] <= 0.5) {
                                if (input[26] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var2;
        if (input[13] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[22] <= 0.5) {
                    if (input[24] <= 0.5) {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var2 = new double[] {0.5, 0.0, 0.5};
                    }
                } else {
                    if (input[15] <= 0.5) {
                        if (input[18] <= 0.5) {
                            if (input[4] <= 0.5) {
                                var2 = new double[] {0.8, 0.2, 0.0};
                            } else {
                                if (input[21] <= 0.5) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var2 = new double[] {0.5, 0.5, 0.0};
                                }
                            }
                        } else {
                            if (input[5] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var2 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[8] <= 0.5) {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[16] <= 0.5) {
                                    var2 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var2 = new double[] {0.16666666666666666, 0.0, 0.8333333333333334};
                                }
                            }
                        } else {
                            if (input[36] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[40] <= 0.5) {
                                    var2 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var2 = new double[] {0.14285714285714285, 0.0, 0.8571428571428571};
                                }
                            }
                        }
                    }
                }
            } else {
                var2 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[30] <= 0.5) {
                    var2 = new double[] {0.8, 0.2, 0.0};
                } else {
                    if (input[19] <= 0.5) {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[14] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[19] <= 0.5) {
                        var2 = new double[] {0.5000000000000001, 0.33333333333333337, 0.16666666666666669};
                    } else {
                        if (input[11] <= 0.5) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[2] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var2 = new double[] {0.75, 0.25, 0.0};
                            }
                        }
                    }
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var3;
        if (input[24] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[27] <= 0.5) {
                    var3 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[4] <= 0.5) {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var3 = new double[] {0.5, 0.5, 0.0};
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[38] <= 0.5) {
                        if (input[25] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var3 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.0, 0.2, 0.8};
                        }
                    }
                } else {
                    if (input[37] <= 0.5) {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[32] <= 0.5) {
                            if (input[20] <= 0.5) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[8] <= 0.5) {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var3 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            }
                        } else {
                            if (input[25] <= 0.5) {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[35] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[40] <= 0.5) {
                        var3 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            if (input[26] <= 0.5) {
                                var3 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var3 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        }
                    }
                } else {
                    var3 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[39] <= 0.5) {
                    if (input[38] <= 0.5) {
                        if (input[40] <= 0.5) {
                            var3 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            if (input[36] <= 0.5) {
                                if (input[34] <= 0.5) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var3 = new double[] {0.6, 0.4, 0.0};
                                }
                            } else {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var3 = new double[] {0.75, 0.25, 0.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                } else {
                    if (input[14] <= 0.5) {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var3 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                    }
                }
            }
        }
        double[] var4;
        if (input[7] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[4] <= 0.5) {
                    var4 = new double[] {0.5, 0.5, 0.0};
                } else {
                    var4 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[31] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[37] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[13] <= 0.5) {
                            if (input[2] <= 0.5) {
                                if (input[34] <= 0.5) {
                                    var4 = new double[] {0.0, 0.2727272727272727, 0.7272727272727273};
                                } else {
                                    var4 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var4 = new double[] {0.42857142857142855, 0.0, 0.5714285714285714};
                        }
                    }
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var4 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            if (input[25] <= 0.5) {
                                if (input[40] <= 0.5) {
                                    var4 = new double[] {0.875, 0.125, 0.0};
                                } else {
                                    var4 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[20] <= 0.5) {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[19] <= 0.5) {
                            var4 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var5;
        if (input[24] <= 0.5) {
            if (input[15] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[20] <= 0.5) {
                            if (input[18] <= 0.5) {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[25] <= 0.5) {
                        var5 = new double[] {0.3333333333333333, 0.3333333333333333, 0.3333333333333333};
                    } else {
                        var5 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    var5 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[2] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var5 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    } else {
                        if (input[23] <= 0.5) {
                            if (input[18] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[12] <= 0.5) {
                                    var5 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var5 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                                }
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[35] <= 0.5) {
                if (input[34] <= 0.5) {
                    if (input[15] <= 0.5) {
                        if (input[16] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            if (input[39] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[40] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var5 = new double[] {0.6, 0.4, 0.0};
                        }
                    } else {
                        if (input[27] <= 0.5) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        }
                    }
                }
            } else {
                if (input[32] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[13] <= 0.5) {
                            if (input[10] <= 0.5) {
                                var5 = new double[] {0.8, 0.0, 0.2};
                            } else {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 0.6, 0.4};
                        }
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var6;
        if (input[31] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[9] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[21] <= 0.5) {
                            if (input[38] <= 0.5) {
                                var6 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var6 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    }
                } else {
                    if (input[36] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var6 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[16] <= 0.5) {
                            if (input[29] <= 0.5) {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                var6 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[18] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    var6 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[4] <= 0.5) {
                        if (input[38] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[10] <= 0.5) {
                                if (input[7] <= 0.5) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[7] <= 0.5) {
                                    var6 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[16] <= 0.5) {
                                if (input[23] <= 0.5) {
                                    var6 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[32] <= 0.5) {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var6 = new double[] {0.0, 0.75, 0.25};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[24] <= 0.5) {
            if (input[37] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var7 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[16] <= 0.5) {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        var7 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                    } else {
                        if (input[22] <= 0.5) {
                            if (input[16] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[28] <= 0.5) {
                    if (input[16] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var7 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var7 = new double[] {0.25, 0.0, 0.75};
                        }
                    }
                } else {
                    if (input[19] <= 0.5) {
                        if (input[39] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[32] <= 0.5) {
                                var7 = new double[] {0.2, 0.0, 0.8};
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        } else {
                            var7 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            }
        } else {
            if (input[29] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[34] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[11] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    } else {
                        if (input[13] <= 0.5) {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var7 = new double[] {0.25, 0.75, 0.0};
                        }
                    }
                } else {
                    if (input[13] <= 0.5) {
                        var7 = new double[] {0.25, 0.75, 0.0};
                    } else {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[13] <= 0.5) {
                    if (input[14] <= 0.5) {
                        if (input[36] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var7 = new double[] {0.5, 0.25, 0.25};
                            } else {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var7 = new double[] {0.5, 0.5, 0.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var7 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[11] <= 0.5) {
                                var7 = new double[] {0.0, 0.2, 0.8};
                            } else {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[31] <= 0.5) {
                                if (input[20] <= 0.5) {
                                    var7 = new double[] {0.8, 0.2, 0.0};
                                } else {
                                    var7 = new double[] {0.5, 0.5, 0.0};
                                }
                            } else {
                                if (input[7] <= 0.5) {
                                    var7 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var8;
        if (input[19] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var8 = new double[] {0.75, 0.25, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[29] <= 0.5) {
                                var8 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[2] <= 0.5) {
                            if (input[20] <= 0.5) {
                                var8 = new double[] {0.1111111111111111, 0.8888888888888888, 0.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        if (input[30] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[34] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var8 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[24] <= 0.5) {
                        if (input[36] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[13] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[8] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.0, 0.7142857142857143, 0.2857142857142857};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[0] <= 0.5) {
                    var8 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[20] <= 0.5) {
                    var8 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[24] <= 0.5) {
                        if (input[25] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        } else {
                            var8 = new double[] {0.0, 0.7142857142857143, 0.2857142857142857};
                        }
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var9;
        if (input[30] <= 0.5) {
            if (input[28] <= 0.5) {
                if (input[19] <= 0.5) {
                    if (input[29] <= 0.5) {
                        var9 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[26] <= 0.5) {
                            var9 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var9 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var9 = new double[] {0.4, 0.6, 0.0};
                    } else {
                        if (input[14] <= 0.5) {
                            if (input[8] <= 0.5) {
                                var9 = new double[] {0.6, 0.4, 0.0};
                            } else {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var9 = new double[] {0.25, 0.75, 0.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    var9 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var9 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[25] <= 0.5) {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[18] <= 0.5) {
                            var9 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[40] <= 0.5) {
                        var9 = new double[] {0.0, 0.8571428571428571, 0.14285714285714285};
                    } else {
                        if (input[27] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var9 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var9 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                var9 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var10;
        if (input[24] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[26] <= 0.5) {
                        var10 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var10 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[33] <= 0.5) {
                    if (input[23] <= 0.5) {
                        if (input[25] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[8] <= 0.5) {
                                    var10 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var10 = new double[] {0.0, 0.5, 0.5};
                                }
                            }
                        } else {
                            if (input[4] <= 0.5) {
                                var10 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            } else {
                                var10 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                            }
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[22] <= 0.5) {
                            var10 = new double[] {0.5, 0.0, 0.5};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var10 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[14] <= 0.5) {
                if (input[13] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[40] <= 0.5) {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var10 = new double[] {0.28571428571428575, 0.4285714285714286, 0.28571428571428575};
                            }
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var10 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var10 = new double[] {0.75, 0.0, 0.25};
                            }
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[0] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[17] <= 0.5) {
                    var10 = new double[] {0.42857142857142855, 0.42857142857142855, 0.14285714285714285};
                } else {
                    var10 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var11;
        if (input[7] <= 0.5) {
            if (input[37] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var11 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var11 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[15] <= 0.5) {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var11 = new double[] {0.5, 0.0, 0.5};
                    }
                }
            } else {
                if (input[20] <= 0.5) {
                    var11 = new double[] {0.75, 0.25, 0.0};
                } else {
                    if (input[30] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var11 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            var11 = new double[] {0.6, 0.4, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[8] <= 0.5) {
                                if (input[18] <= 0.5) {
                                    var11 = new double[] {0.0, 0.25, 0.75};
                                } else {
                                    var11 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[0] <= 0.5) {
                                    var11 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var11 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (input[5] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[39] <= 0.5) {
                            if (input[28] <= 0.5) {
                                if (input[13] <= 0.5) {
                                    var11 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var11 = new double[] {0.25, 0.75, 0.0};
                                }
                            } else {
                                var11 = new double[] {0.3076923076923077, 0.6923076923076923, 0.0};
                            }
                        } else {
                            if (input[20] <= 0.5) {
                                var11 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[3] <= 0.5) {
                                    var11 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var11 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var11 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            }
                        } else {
                            if (input[9] <= 0.5) {
                                if (input[18] <= 0.5) {
                                    var11 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var11 = new double[] {0.0, 0.2, 0.8};
                                }
                            } else {
                                var11 = new double[] {0.0, 0.75, 0.25};
                            }
                        }
                    }
                } else {
                    var11 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var11 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[32] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var11 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var11 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var12;
        if (input[36] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[4] <= 0.5) {
                    var12 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[3] <= 0.5) {
                        var12 = new double[] {0.25, 0.75, 0.0};
                    } else {
                        if (input[33] <= 0.5) {
                            var12 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[38] <= 0.5) {
                    if (input[14] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[33] <= 0.5) {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[16] <= 0.5) {
                                    var12 = new double[] {0.75, 0.25, 0.0};
                                } else {
                                    var12 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[22] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[0] <= 0.5) {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[20] <= 0.5) {
                if (input[15] <= 0.5) {
                    var12 = new double[] {0.25, 0.75, 0.0};
                } else {
                    var12 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    } else {
                        if (input[15] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var12 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[18] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[33] <= 0.5) {
                                    var12 = new double[] {0.1, 0.0, 0.9};
                                } else {
                                    var12 = new double[] {0.8, 0.0, 0.2};
                                }
                            }
                        }
                    }
                } else {
                    var12 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var13;
        if (input[30] <= 0.5) {
            if (input[26] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[15] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var13 = new double[] {0.5, 0.5, 0.0};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var13 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var13 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var13 = new double[] {0.2, 0.8, 0.0};
                        }
                    }
                }
            } else {
                if (input[21] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[37] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[39] <= 0.5) {
                                if (input[32] <= 0.5) {
                                    var13 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var13 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                }
                            } else {
                                var13 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        }
                    } else {
                        if (input[38] <= 0.5) {
                            if (input[19] <= 0.5) {
                                var13 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var13 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                        }
                    }
                } else {
                    if (input[32] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[13] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var13 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[20] <= 0.5) {
                    var13 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[11] <= 0.5) {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[33] <= 0.5) {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var13 = new double[] {0.0, 0.25, 0.75};
                            }
                        } else {
                            var13 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[24] <= 0.5) {
                            var13 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var13 = new double[] {0.0, 0.75, 0.25};
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                } else {
                    if (input[34] <= 0.5) {
                        if (input[2] <= 0.5) {
                            if (input[33] <= 0.5) {
                                var13 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            } else {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[27] <= 0.5) {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            }
        }
        return mulVectorNumber(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine0(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), 0.01);
    }
    public static double[] subroutine0(double[] input) {
        double[] var0;
        if (input[36] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[24] <= 0.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[28] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[1] <= 0.5) {
                                var0 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[37] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var0 = new double[] {0.4, 0.6, 0.0};
                    }
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[22] <= 0.5) {
                            var0 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[25] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var0 = new double[] {0.5, 0.0, 0.5};
                        }
                    } else {
                        if (input[37] <= 0.5) {
                            var0 = new double[] {0.4, 0.0, 0.6};
                        } else {
                            if (input[38] <= 0.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[22] <= 0.5) {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var0 = new double[] {0.2, 0.8, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var1;
        if (input[25] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[22] <= 0.5) {
                        var1 = new double[] {0.25, 0.125, 0.625};
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var1 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[37] <= 0.5) {
                        if (input[24] <= 0.5) {
                            var1 = new double[] {0.5000000000000001, 0.33333333333333337, 0.16666666666666669};
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[37] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[16] <= 0.5) {
                                if (input[26] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var1 = new double[] {0.25, 0.75, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[34] <= 0.5) {
                    if (input[38] <= 0.5) {
                        if (input[13] <= 0.5) {
                            if (input[39] <= 0.5) {
                                var1 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var1 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[27] <= 0.5) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[33] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.4, 0.2, 0.4};
                                }
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[15] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.75, 0.0, 0.25};
                        }
                    }
                }
            } else {
                var1 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var2;
        if (input[27] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[30] <= 0.5) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 0.5) {
                        if (input[36] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[21] <= 0.5) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[24] <= 0.5) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[25] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var2 = new double[] {0.25, 0.75, 0.0};
                            }
                        }
                    }
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[31] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[37] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var2 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var2 = new double[] {0.0, 0.375, 0.625};
                    }
                }
            } else {
                if (input[33] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[35] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var2 = new double[] {0.4, 0.2, 0.4};
                    }
                } else {
                    if (input[24] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[16] <= 0.5) {
                            var2 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var3;
        if (input[6] <= 0.5) {
            if (input[23] <= 0.5) {
                if (input[40] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[13] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var3 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[36] <= 0.5) {
                if (input[18] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[3] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var3 = new double[] {0.75, 0.25, 0.0};
                    } else {
                        if (input[8] <= 0.5) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.2, 0.0, 0.8};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var3 = new double[] {0.5, 0.0, 0.5};
                            }
                        } else {
                            if (input[17] <= 0.5) {
                                var3 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                            } else {
                                var3 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var3 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.16666666666666669, 0.6666666666666667, 0.16666666666666669};
                            }
                        }
                    }
                }
            }
        }
        double[] var4;
        if (input[31] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[13] <= 0.5) {
                            var4 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                        } else {
                            var4 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[15] <= 0.5) {
                    if (input[21] <= 0.5) {
                        if (input[28] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[30] <= 0.5) {
                                if (input[1] <= 0.5) {
                                    var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var4 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var4 = new double[] {0.75, 0.25, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[9] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var4 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                        }
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[19] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[35] <= 0.5) {
                                var4 = new double[] {0.0, 0.75, 0.25};
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[20] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        if (input[40] <= 0.5) {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var4 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        if (input[9] <= 0.5) {
                            var4 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[26] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var4 = new double[] {0.4, 0.0, 0.6};
                            }
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            if (input[16] <= 0.5) {
                                var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var5;
        if (input[24] <= 0.5) {
            if (input[15] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[37] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var5 = new double[] {0.6, 0.0, 0.4};
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var5 = new double[] {0.0, 0.2, 0.8};
                    }
                } else {
                    var5 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[13] <= 0.5) {
                        var5 = new double[] {0.375, 0.625, 0.0};
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var5 = new double[] {0.2, 0.0, 0.8};
                        } else {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var5 = new double[] {0.0, 0.25, 0.75};
                            }
                        } else {
                            if (input[18] <= 0.5) {
                                if (input[7] <= 0.5) {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var5 = new double[] {0.0, 0.5, 0.5};
                                }
                            } else {
                                if (input[7] <= 0.5) {
                                    var5 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var5 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (input[14] <= 0.5) {
                if (input[28] <= 0.5) {
                    if (input[35] <= 0.5) {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[11] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var5 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[31] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[0] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.0, 0.6, 0.4};
                        }
                    } else {
                        if (input[21] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                if (input[33] <= 0.5) {
                                    var5 = new double[] {0.0, 0.75, 0.25};
                                } else {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[27] <= 0.5) {
                                var5 = new double[] {0.75, 0.25, 0.0};
                            } else {
                                var5 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[27] <= 0.5) {
                        var5 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var5 = new double[] {0.8571428571428571, 0.0, 0.14285714285714285};
                    }
                } else {
                    var5 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var6;
        if (input[24] <= 0.5) {
            if (input[20] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[40] <= 0.5) {
                        var6 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                    } else {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[23] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[11] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[8] <= 0.5) {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[0] <= 0.5) {
                                    var6 = new double[] {0.14285714285714285, 0.0, 0.8571428571428571};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[0] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[27] <= 0.5) {
                if (input[14] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[8] <= 0.5) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[1] <= 0.5) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var6 = new double[] {0.6, 0.4, 0.0};
                                }
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var6 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[22] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var6 = new double[] {0.5, 0.5, 0.0};
                    }
                }
            } else {
                if (input[22] <= 0.5) {
                    if (input[19] <= 0.5) {
                        var6 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[40] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[25] <= 0.5) {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var6 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                            }
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var6 = new double[] {0.75, 0.0, 0.25};
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[20] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[29] <= 0.5) {
                        var7 = new double[] {0.4, 0.6, 0.0};
                    } else {
                        if (input[0] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[13] <= 0.5) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[21] <= 0.5) {
                            var7 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var7 = new double[] {0.75, 0.25, 0.0};
                        }
                    }
                }
            } else {
                var7 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[6] <= 0.5) {
                    var7 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[7] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var7 = new double[] {0.16666666666666666, 0.0, 0.8333333333333334};
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[21] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[16] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var7 = new double[] {0.375, 0.625, 0.0};
                    } else {
                        if (input[33] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.25, 0.75, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[22] <= 0.5) {
                        if (input[13] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var7 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            }
                        } else {
                            var7 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            if (input[29] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[12] <= 0.5) {
                                    var7 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                } else {
                                    var7 = new double[] {0.8, 0.0, 0.2};
                                }
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var7 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                            } else {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var8;
        if (input[9] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[0] <= 0.5) {
                    var8 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    var8 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[11] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.25, 0.5, 0.25};
                            }
                        }
                    } else {
                        var8 = new double[] {0.7777777777777778, 0.2222222222222222, 0.0};
                    }
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var8 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[31] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[5] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                }
            }
        }
        double[] var9;
        if (input[30] <= 0.5) {
            if (input[27] <= 0.5) {
                if (input[26] <= 0.5) {
                    var9 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[19] <= 0.5) {
                        if (input[24] <= 0.5) {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var9 = new double[] {0.25, 0.75, 0.0};
                        }
                    } else {
                        var9 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[25] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var9 = new double[] {0.25, 0.75, 0.0};
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var9 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                    } else {
                        if (input[13] <= 0.5) {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var9 = new double[] {0.375, 0.625, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var9 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[24] <= 0.5) {
                    if (input[20] <= 0.5) {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[8] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[1] <= 0.5) {
                                if (input[39] <= 0.5) {
                                    var9 = new double[] {0.0, 0.08333333333333333, 0.9166666666666666};
                                } else {
                                    var9 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[25] <= 0.5) {
                                    var9 = new double[] {0.0, 0.17647058823529413, 0.8235294117647058};
                                } else {
                                    var9 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var9 = new double[] {0.0, 0.4, 0.6};
                    } else {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var10;
        if (input[24] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var10 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[13] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var10 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var10 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[21] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var10 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                    }
                } else {
                    if (input[19] <= 0.5) {
                        if (input[26] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var10 = new double[] {0.875, 0.0, 0.125};
                            }
                        }
                    } else {
                        if (input[33] <= 0.5) {
                            if (input[30] <= 0.5) {
                                var10 = new double[] {0.2, 0.8, 0.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[23] <= 0.5) {
                                var10 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var10 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[28] <= 0.5) {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[9] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.8, 0.2, 0.0};
                        }
                    } else {
                        if (input[15] <= 0.5) {
                            var10 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[39] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[21] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var10 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var11;
        if (input[15] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[32] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var11 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var11 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[5] <= 0.5) {
                                if (input[13] <= 0.5) {
                                    var11 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var11 = new double[] {0.5, 0.5, 0.0};
                                }
                            } else {
                                var11 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var11 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[40] <= 0.5) {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[40] <= 0.5) {
                        var11 = new double[] {0.0, 0.5, 0.5};
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[13] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var11 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            if (input[35] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    var11 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var11 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var11 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var11 = new double[] {0.5, 0.0, 0.5};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[20] <= 0.5) {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[9] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[40] <= 0.5) {
                                    var11 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var11 = new double[] {0.5, 0.16666666666666666, 0.3333333333333333};
                                }
                            }
                        }
                    }
                } else {
                    if (input[26] <= 0.5) {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var11 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var11 = new double[] {0.75, 0.25, 0.0};
                            }
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var12;
        if (input[30] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[13] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[35] <= 0.5) {
                            var12 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[15] <= 0.5) {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[27] <= 0.5) {
                                var12 = new double[] {0.25, 0.75, 0.0};
                            } else {
                                var12 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[38] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            var12 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[40] <= 0.5) {
                        var12 = new double[] {0.1111111111111111, 0.8888888888888888, 0.0};
                    } else {
                        if (input[21] <= 0.5) {
                            var12 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[36] <= 0.5) {
                var12 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[6] <= 0.5) {
                    var12 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[29] <= 0.5) {
                        if (input[5] <= 0.5) {
                            if (input[0] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[35] <= 0.5) {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var13;
        if (input[36] <= 0.5) {
            if (input[39] <= 0.5) {
                if (input[14] <= 0.5) {
                    if (input[21] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[6] <= 0.5) {
                                var13 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            if (input[31] <= 0.5) {
                                if (input[2] <= 0.5) {
                                    var13 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var13 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                                }
                            } else {
                                var13 = new double[] {0.25, 0.75, 0.0};
                            }
                        } else {
                            if (input[32] <= 0.5) {
                                var13 = new double[] {0.6, 0.4, 0.0};
                            } else {
                                var13 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[34] <= 0.5) {
                        if (input[19] <= 0.5) {
                            if (input[4] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.75, 0.25, 0.0};
                            }
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            var13 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[32] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var13 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var13 = new double[] {0.6, 0.0, 0.4};
                        }
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        var13 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                    } else {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[38] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[9] <= 0.5) {
                            var13 = new double[] {0.14285714285714285, 0.0, 0.8571428571428571};
                        } else {
                            if (input[27] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var14;
        if (input[6] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[16] <= 0.5) {
                    if (input[2] <= 0.5) {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var14 = new double[] {0.8, 0.2, 0.0};
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[37] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var14 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var14 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    }
                }
            } else {
                if (input[40] <= 0.5) {
                    if (input[21] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[4] <= 0.5) {
                                var14 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var14 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var14 = new double[] {0.5, 0.5, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[33] <= 0.5) {
                        if (input[27] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var14 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var14 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                            }
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[35] <= 0.5) {
                                var14 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var14 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var14 = new double[] {0.6, 0.0, 0.4};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var14 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var14 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var14 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var14 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                var14 = new double[] {0.0, 1.0, 0.0};
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine1(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14);
    }
    public static double[] subroutine1(double[] input) {
        double[] var0;
        if (input[20] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[35] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[18] <= 0.5) {
                            if (input[11] <= 0.5) {
                                if (input[29] <= 0.5) {
                                    var0 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[10] <= 0.5) {
                            var0 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[23] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[21] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        var0 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var0 = new double[] {0.0, 0.5, 0.5};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var0 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[18] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[37] <= 0.5) {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var0 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            }
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.25, 0.75};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[19] <= 0.5) {
                            if (input[30] <= 0.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[17] <= 0.5) {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var0 = new double[] {0.0, 0.625, 0.375};
                                }
                            }
                        } else {
                            if (input[27] <= 0.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var1;
        if (input[36] <= 0.5) {
            if (input[23] <= 0.5) {
                if (input[17] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[10] <= 0.5) {
                                if (input[21] <= 0.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[15] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    var1 = new double[] {0.8, 0.2, 0.0};
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[9] <= 0.5) {
                                    var1 = new double[] {0.5, 0.5, 0.0};
                                } else {
                                    var1 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                }
                            }
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[13] <= 0.5) {
                                var1 = new double[] {0.25, 0.75, 0.0};
                            } else {
                                if (input[0] <= 0.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            } else {
                var1 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[37] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var1 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var1 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var1 = new double[] {0.4, 0.2, 0.4};
                        }
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        if (input[29] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[8] <= 0.5) {
                                    var1 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                if (input[2] <= 0.5) {
                                    var1 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            if (input[28] <= 0.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[33] <= 0.5) {
                                    var1 = new double[] {0.0, 0.25, 0.75};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[19] <= 0.5) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var1 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            }
                        }
                    }
                }
            }
        }
        double[] var2;
        if (input[29] <= 0.5) {
            if (input[19] <= 0.5) {
                if (input[36] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var2 = new double[] {0.2, 0.8, 0.0};
                        }
                    } else {
                        var2 = new double[] {0.875, 0.125, 0.0};
                    }
                } else {
                    if (input[25] <= 0.5) {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[28] <= 0.5) {
                            var2 = new double[] {0.8, 0.0, 0.2};
                        } else {
                            if (input[3] <= 0.5) {
                                var2 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var2 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                    } else {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[25] <= 0.5) {
                            if (input[20] <= 0.5) {
                                var2 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var2 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            if (input[28] <= 0.5) {
                                var2 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[20] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[19] <= 0.5) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var2 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[38] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var2 = new double[] {0.2, 0.8, 0.0};
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[19] <= 0.5) {
                        var2 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[13] <= 0.5) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[22] <= 0.5) {
                            var2 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            if (input[11] <= 0.5) {
                                var2 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                            } else {
                                var2 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[15] <= 0.5) {
                        if (input[16] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var2 = new double[] {0.8, 0.0, 0.2};
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[35] <= 0.5) {
                                if (input[8] <= 0.5) {
                                    var2 = new double[] {0.3333333333333333, 0.16666666666666666, 0.5};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[24] <= 0.5) {
                                    var2 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var3;
        if (input[0] <= 0.5) {
            if (input[30] <= 0.5) {
                var3 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[36] <= 0.5) {
                    var3 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[15] <= 0.5) {
                        if (input[38] <= 0.5) {
                            var3 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            var3 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var4;
        if (input[2] <= 0.5) {
            if (input[20] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var4 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[15] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var4 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var4 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            } else {
                                var4 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        } else {
                            if (input[28] <= 0.5) {
                                var4 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[23] <= 0.5) {
                if (input[13] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[27] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var4 = new double[] {0.8571428571428571, 0.0, 0.14285714285714285};
                            }
                        } else {
                            if (input[25] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    var4 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var4 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[38] <= 0.5) {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[0] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    var4 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var4 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[19] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var4 = new double[] {0.5, 0.25, 0.25};
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var5;
        if (input[33] <= 0.5) {
            if (input[13] <= 0.5) {
                if (input[20] <= 0.5) {
                    var5 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                } else {
                    if (input[10] <= 0.5) {
                        if (input[26] <= 0.5) {
                            if (input[38] <= 0.5) {
                                if (input[21] <= 0.5) {
                                    var5 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                } else {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var5 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            } else {
                                if (input[16] <= 0.5) {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var5 = new double[] {0.0, 0.5, 0.5};
                                }
                            }
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            var5 = new double[] {0.0, 0.75, 0.25};
                        } else {
                            var5 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                        }
                    }
                }
            } else {
                if (input[29] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var5 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var5 = new double[] {0.25, 0.75, 0.0};
                            } else {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[29] <= 0.5) {
                if (input[21] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var5 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[18] <= 0.5) {
                                if (input[27] <= 0.5) {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var5 = new double[] {0.16666666666666666, 0.0, 0.8333333333333334};
                                }
                            } else {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var5 = new double[] {0.8, 0.2, 0.0};
                        }
                    }
                } else {
                    if (input[35] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var5 = new double[] {0.6, 0.2, 0.2};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var5 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var5 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[30] <= 0.5) {
                            if (input[35] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[37] <= 0.5) {
                                var5 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[14] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.6, 0.4, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var6;
        if (input[37] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[15] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[8] <= 0.5) {
                                if (input[40] <= 0.5) {
                                    var6 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var6 = new double[] {0.5, 0.5, 0.0};
                                }
                            } else {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[20] <= 0.5) {
                                if (input[19] <= 0.5) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var6 = new double[] {0.25, 0.0, 0.75};
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[14] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var6 = new double[] {0.0, 0.5, 0.5};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[25] <= 0.5) {
                if (input[24] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[11] <= 0.5) {
                                if (input[32] <= 0.5) {
                                    var6 = new double[] {0.0, 0.058823529411764705, 0.9411764705882353};
                                } else {
                                    var6 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            } else {
                                var6 = new double[] {0.0, 0.4444444444444444, 0.5555555555555556};
                            }
                        } else {
                            var6 = new double[] {0.0, 0.75, 0.25};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var6 = new double[] {0.4, 0.6, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[9] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[36] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var6 = new double[] {0.2, 0.8, 0.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            var6 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        } else {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[24] <= 0.5) {
            if (input[37] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[20] <= 0.5) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var7 = new double[] {0.5, 0.0, 0.5};
                    }
                } else {
                    var7 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[19] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var7 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            var7 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[25] <= 0.5) {
                        if (input[17] <= 0.5) {
                            if (input[26] <= 0.5) {
                                var7 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var7 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[37] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var7 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[21] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[13] <= 0.5) {
                                var7 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var7 = new double[] {0.7142857142857143, 0.0, 0.2857142857142857};
                            }
                        }
                    } else {
                        if (input[13] <= 0.5) {
                            var7 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var7 = new double[] {0.6, 0.4, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[39] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.5, 0.0, 0.5};
                        }
                    } else {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var7 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var8;
        if (input[6] <= 0.5) {
            if (input[37] <= 0.5) {
                if (input[14] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[25] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[20] <= 0.5) {
                                    var8 = new double[] {0.25, 0.75, 0.0};
                                } else {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        var8 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var8 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[38] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[30] <= 0.5) {
                                var8 = new double[] {0.9, 0.1, 0.0};
                            } else {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var8 = new double[] {0.4, 0.0, 0.6};
                        }
                    } else {
                        if (input[27] <= 0.5) {
                            var8 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[36] <= 0.5) {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[26] <= 0.5) {
                            if (input[29] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[35] <= 0.5) {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[14] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[27] <= 0.5) {
                                    var8 = new double[] {0.8, 0.2, 0.0};
                                } else {
                                    var8 = new double[] {0.5, 0.5, 0.0};
                                }
                            }
                        } else {
                            var8 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    }
                } else {
                    if (input[15] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            if (input[29] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 0.375, 0.625};
                            }
                        } else {
                            if (input[10] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[0] <= 0.5) {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var9;
        if (input[25] <= 0.5) {
            if (input[27] <= 0.5) {
                if (input[21] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[30] <= 0.5) {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[7] <= 0.5) {
                                    var9 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var9 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[32] <= 0.5) {
                                var9 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var9 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                            }
                        } else {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[28] <= 0.5) {
                        if (input[5] <= 0.5) {
                            if (input[32] <= 0.5) {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var9 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var9 = new double[] {0.2, 0.8, 0.0};
                        }
                    } else {
                        if (input[18] <= 0.5) {
                            var9 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        } else {
                            if (input[16] <= 0.5) {
                                var9 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var9 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            } else {
                                var9 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[31] <= 0.5) {
                    if (input[13] <= 0.5) {
                        var9 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var9 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var9 = new double[] {0.5, 0.0, 0.5};
                            }
                        } else {
                            if (input[39] <= 0.5) {
                                var9 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[35] <= 0.5) {
                        var9 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[19] <= 0.5) {
                                var9 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var9 = new double[] {0.0, 0.2, 0.8};
                            }
                        }
                    }
                }
            } else {
                var9 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var10;
        if (input[20] <= 0.5) {
            if (input[24] <= 0.5) {
                if (input[4] <= 0.5) {
                    var10 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[25] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.75, 0.25, 0.0};
                        }
                    } else {
                        var10 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[33] <= 0.5) {
                                if (input[6] <= 0.5) {
                                    var10 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var10 = new double[] {0.5, 0.5, 0.0};
                                }
                            } else {
                                var10 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    }
                } else {
                    var10 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[7] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[39] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var10 = new double[] {0.0, 0.5, 0.5};
                            }
                        } else {
                            var10 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[37] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.25, 0.75, 0.0};
                            }
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 0.8, 0.2};
                        }
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[6] <= 0.5) {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var10 = new double[] {0.25, 0.0, 0.75};
                            }
                        } else {
                            if (input[36] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    } else {
                        var10 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[26] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[3] <= 0.5) {
                                if (input[9] <= 0.5) {
                                    var10 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var10 = new double[] {0.0, 0.5, 0.5};
                                }
                            } else {
                                if (input[0] <= 0.5) {
                                    var10 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var10 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[4] <= 0.5) {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var10 = new double[] {0.6, 0.2, 0.2};
                            }
                        }
                    } else {
                        if (input[15] <= 0.5) {
                            var10 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            if (input[17] <= 0.5) {
                                if (input[19] <= 0.5) {
                                    var10 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var10 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[9] <= 0.5) {
                                    var10 = new double[] {0.5, 0.5, 0.0};
                                } else {
                                    var10 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var11;
        if (input[24] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[36] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[22] <= 0.5) {
                        var11 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[11] <= 0.5) {
                            if (input[33] <= 0.5) {
                                if (input[4] <= 0.5) {
                                    var11 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                                } else {
                                    var11 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[2] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[21] <= 0.5) {
                                    var11 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var11 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[40] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var11 = new double[] {0.5, 0.0, 0.5};
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var11 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[1] <= 0.5) {
                if (input[21] <= 0.5) {
                    if (input[20] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var11 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[14] <= 0.5) {
                            var11 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var11 = new double[] {0.125, 0.875, 0.0};
                        } else {
                            var11 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[38] <= 0.5) {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[6] <= 0.5) {
                                var11 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var11 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            }
                        }
                    }
                } else {
                    var11 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var12;
        if (input[0] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[1] <= 0.5) {
                            if (input[36] <= 0.5) {
                                if (input[17] <= 0.5) {
                                    var12 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var12 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                }
                            } else {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[17] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                            }
                        }
                    } else {
                        if (input[38] <= 0.5) {
                            var12 = new double[] {0.5, 0.0, 0.5};
                        } else {
                            if (input[21] <= 0.5) {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var12 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[21] <= 0.5) {
                        if (input[25] <= 0.5) {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[27] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.25, 0.0, 0.75};
                            }
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var12 = new double[] {0.0, 0.4, 0.6};
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    var12 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[30] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var12 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            var12 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var13;
        if (input[7] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[35] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[37] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var13 = new double[] {0.2, 0.8, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[37] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        var13 = new double[] {0.75, 0.0, 0.25};
                    } else {
                        var13 = new double[] {0.0, 0.625, 0.375};
                    }
                }
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[25] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[3] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[30] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[38] <= 0.5) {
                                var13 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var13 = new double[] {0.4, 0.0, 0.6};
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var13 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[33] <= 0.5) {
                                var13 = new double[] {0.14285714285714285, 0.0, 0.8571428571428571};
                            } else {
                                var13 = new double[] {0.6, 0.0, 0.4};
                            }
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var14;
        if (input[6] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[24] <= 0.5) {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[22] <= 0.5) {
                        if (input[37] <= 0.5) {
                            var14 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[34] <= 0.5) {
                            var14 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var14 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[39] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[36] <= 0.5) {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[27] <= 0.5) {
                            if (input[13] <= 0.5) {
                                if (input[31] <= 0.5) {
                                    var14 = new double[] {0.36363636363636365, 0.0, 0.6363636363636364};
                                } else {
                                    var14 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[17] <= 0.5) {
                                    var14 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var14 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[25] <= 0.5) {
                                var14 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[40] <= 0.5) {
                                    var14 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var14 = new double[] {0.2, 0.0, 0.8};
                                }
                            }
                        }
                    }
                }
            } else {
                var14 = new double[] {0.0, 1.0, 0.0};
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine2(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14);
    }
    public static double[] subroutine2(double[] input) {
        double[] var0;
        if (input[29] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[25] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[27] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[10] <= 0.5) {
                            if (input[21] <= 0.5) {
                                if (input[8] <= 0.5) {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var0 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                                }
                            } else {
                                if (input[9] <= 0.5) {
                                    var0 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var0 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            }
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[25] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[39] <= 0.5) {
                            var0 = new double[] {0.4, 0.0, 0.6};
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[34] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var0 = new double[] {0.3, 0.4, 0.3};
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                var0 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var1;
        if (input[0] <= 0.5) {
            if (input[23] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[20] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var1 = new double[] {0.4, 0.6, 0.0};
                        } else {
                            if (input[37] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    var1 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                } else {
                                    var1 = new double[] {0.4, 0.0, 0.6};
                                }
                            } else {
                                if (input[33] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.13333333333333333, 0.0, 0.8666666666666667};
                                }
                            }
                        }
                    }
                } else {
                    if (input[28] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[37] <= 0.5) {
                            if (input[18] <= 0.5) {
                                if (input[13] <= 0.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.25, 0.5, 0.25};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[32] <= 0.5) {
                                var1 = new double[] {0.7272727272727273, 0.0, 0.2727272727272727};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[37] <= 0.5) {
                    var1 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                } else {
                    if (input[18] <= 0.5) {
                        var1 = new double[] {0.0, 0.4, 0.6};
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            var1 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var2;
        if (input[36] <= 0.5) {
            if (input[14] <= 0.5) {
                if (input[34] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[33] <= 0.5) {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[8] <= 0.5) {
                                    var2 = new double[] {0.6, 0.4, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var2 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                            }
                        } else {
                            if (input[18] <= 0.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[23] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[30] <= 0.5) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var2 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var2 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var3;
        if (input[30] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[13] <= 0.5) {
                    var3 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[27] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var3 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            if (input[31] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[17] <= 0.5) {
                    if (input[23] <= 0.5) {
                        var3 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                    } else {
                        var3 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var3 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[20] <= 0.5) {
                    var3 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[18] <= 0.5) {
                        if (input[1] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var3 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.0, 0.7142857142857143, 0.2857142857142857};
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    var3 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[7] <= 0.5) {
                        if (input[33] <= 0.5) {
                            if (input[39] <= 0.5) {
                                var3 = new double[] {0.0, 0.5, 0.5};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                        }
                    } else {
                        if (input[13] <= 0.5) {
                            if (input[31] <= 0.5) {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var3 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        } else {
                            if (input[12] <= 0.5) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                }
            }
        }
        double[] var4;
        if (input[30] <= 0.5) {
            if (input[13] <= 0.5) {
                if (input[20] <= 0.5) {
                    var4 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[33] <= 0.5) {
                    if (input[17] <= 0.5) {
                        var4 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        if (input[32] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[40] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var4 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var4 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[0] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var5;
        if (input[20] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[13] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[35] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[29] <= 0.5) {
                                var5 = new double[] {0.8, 0.2, 0.0};
                            } else {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var5 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                    } else {
                        var5 = new double[] {0.6, 0.4, 0.0};
                    }
                }
            } else {
                if (input[25] <= 0.5) {
                    if (input[39] <= 0.5) {
                        var5 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[37] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var5 = new double[] {0.25, 0.75, 0.0};
                    }
                }
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[37] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            if (input[12] <= 0.5) {
                                if (input[22] <= 0.5) {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var5 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                }
                            } else {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var5 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[29] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[18] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[40] <= 0.5) {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var5 = new double[] {0.15384615384615385, 0.38461538461538464, 0.46153846153846156};
                                }
                            }
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 0.5, 0.5};
                        }
                    } else {
                        if (input[32] <= 0.5) {
                            if (input[19] <= 0.5) {
                                var5 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                            } else {
                                var5 = new double[] {0.6, 0.4, 0.0};
                            }
                        } else {
                            if (input[24] <= 0.5) {
                                var5 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                var5 = new double[] {0.2, 0.6, 0.2};
                            }
                        }
                    }
                }
            }
        }
        double[] var6;
        if (input[24] <= 0.5) {
            if (input[21] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[23] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var6 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[40] <= 0.5) {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[7] <= 0.5) {
                                if (input[17] <= 0.5) {
                                    var6 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[25] <= 0.5) {
                    if (input[15] <= 0.5) {
                        if (input[26] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            if (input[32] <= 0.5) {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var6 = new double[] {0.0, 0.5, 0.5};
                            }
                        } else {
                            var6 = new double[] {0.0, 0.5555555555555556, 0.4444444444444444};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[10] <= 0.5) {
                            var6 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[33] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[32] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var6 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[13] <= 0.5) {
                        var6 = new double[] {0.0, 0.75, 0.25};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var6 = new double[] {0.4444444444444444, 0.5555555555555556, 0.0};
                        } else {
                            if (input[25] <= 0.5) {
                                if (input[16] <= 0.5) {
                                    var6 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var6 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        } else {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var6 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                            } else {
                                var6 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var6 = new double[] {0.125, 0.875, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var7;
        if (input[24] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[28] <= 0.5) {
                    var7 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 0.5) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[22] <= 0.5) {
                            var7 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[35] <= 0.5) {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[19] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[10] <= 0.5) {
                                if (input[4] <= 0.5) {
                                    var7 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var7 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            }
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            var7 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            var7 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                        }
                    }
                }
            }
        } else {
            if (input[38] <= 0.5) {
                if (input[18] <= 0.5) {
                    var7 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[30] <= 0.5) {
                        if (input[31] <= 0.5) {
                            if (input[27] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.75, 0.25, 0.0};
                            }
                        } else {
                            var7 = new double[] {0.625, 0.375, 0.0};
                        }
                    } else {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[18] <= 0.5) {
                            var7 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            if (input[28] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    } else {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[35] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[40] <= 0.5) {
                                if (input[15] <= 0.5) {
                                    var7 = new double[] {0.5, 0.5, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var7 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var8;
        if (input[20] <= 0.5) {
            if (input[32] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[25] <= 0.5) {
                        if (input[18] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[23] <= 0.5) {
                    if (input[33] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[9] <= 0.5) {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var8 = new double[] {0.8, 0.2, 0.0};
                            }
                        }
                    }
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[19] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[16] <= 0.5) {
                                var8 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            } else {
                                if (input[17] <= 0.5) {
                                    var8 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        var8 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[24] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[24] <= 0.5) {
                    if (input[2] <= 0.5) {
                        var8 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[0] <= 0.5) {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[10] <= 0.5) {
                            if (input[26] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            if (input[6] <= 0.5) {
                                var8 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                            } else {
                                if (input[29] <= 0.5) {
                                    var8 = new double[] {0.4, 0.6, 0.0};
                                } else {
                                    var8 = new double[] {0.42857142857142855, 0.5714285714285714, 0.0};
                                }
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var9;
        if (input[37] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[13] <= 0.5) {
                        var9 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[26] <= 0.5) {
                            if (input[21] <= 0.5) {
                                var9 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var9 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var9 = new double[] {0.5, 0.5, 0.0};
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[22] <= 0.5) {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[20] <= 0.5) {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var9 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[36] <= 0.5) {
                    if (input[33] <= 0.5) {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var9 = new double[] {0.8, 0.2, 0.0};
                    }
                } else {
                    if (input[38] <= 0.5) {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[35] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[11] <= 0.5) {
                                if (input[40] <= 0.5) {
                                    var9 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var9 = new double[] {0.0, 0.2, 0.8};
                                }
                            } else {
                                var9 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[33] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var9 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var9 = new double[] {0.0, 0.5, 0.5};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[9] <= 0.5) {
                                var9 = new double[] {0.25, 0.75, 0.0};
                            } else {
                                var9 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                            }
                        } else {
                            if (input[32] <= 0.5) {
                                var9 = new double[] {0.25, 0.75, 0.0};
                            } else {
                                var9 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var9 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        if (input[29] <= 0.5) {
                            var9 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var10;
        if (input[29] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[19] <= 0.5) {
                    if (input[18] <= 0.5) {
                        if (input[26] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var10 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                            } else {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[37] <= 0.5) {
                        var10 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                    } else {
                        var10 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[32] <= 0.5) {
                    if (input[2] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[31] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[13] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 0.4, 0.6};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[26] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.16666666666666666, 0.0, 0.8333333333333334};
                            }
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[27] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[18] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var10 = new double[] {0.8, 0.2, 0.0};
                            }
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[17] <= 0.5) {
                                var10 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 0.5) {
                                    var10 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var10 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            var10 = new double[] {0.375, 0.625, 0.0};
                        } else {
                            if (input[37] <= 0.5) {
                                var10 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[22] <= 0.5) {
                    var10 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[8] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var10 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            var10 = new double[] {0.0, 0.2, 0.8};
                        } else {
                            if (input[16] <= 0.5) {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var10 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            }
                        }
                    }
                }
            }
        }
        double[] var11;
        if (input[27] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[15] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[33] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var11 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                if (input[9] <= 0.5) {
                                    var11 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var11 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var11 = new double[] {0.4, 0.2, 0.4};
                        } else {
                            var11 = new double[] {0.875, 0.125, 0.0};
                        }
                    }
                }
            } else {
                if (input[29] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var11 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[20] <= 0.5) {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var11 = new double[] {0.4, 0.6, 0.0};
                    } else {
                        if (input[20] <= 0.5) {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var11 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var11 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[25] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var11 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var11 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var11 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        }
                    } else {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var11 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var12;
        if (input[20] <= 0.5) {
            if (input[13] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[16] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var12 = new double[] {0.8, 0.2, 0.0};
                            }
                        } else {
                            if (input[34] <= 0.5) {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var12 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                            }
                        }
                    } else {
                        if (input[39] <= 0.5) {
                            var12 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var12 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[29] <= 0.5) {
                    var12 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[15] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[10] <= 0.5) {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[35] <= 0.5) {
                                    var12 = new double[] {0.75, 0.25, 0.0};
                                } else {
                                    var12 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                                }
                            }
                        }
                    } else {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[40] <= 0.5) {
                        var12 = new double[] {0.25, 0.75, 0.0};
                    } else {
                        var12 = new double[] {0.8, 0.2, 0.0};
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[28] <= 0.5) {
                            var12 = new double[] {0.0, 0.6, 0.4};
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            if (input[7] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[27] <= 0.5) {
                                    var12 = new double[] {0.0, 0.2, 0.8};
                                } else {
                                    var12 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var12 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            } else {
                if (input[15] <= 0.5) {
                    if (input[14] <= 0.5) {
                        if (input[18] <= 0.5) {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var12 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                            } else {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[35] <= 0.5) {
                        if (input[25] <= 0.5) {
                            if (input[13] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    var12 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var12 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var12 = new double[] {0.4, 0.0, 0.6};
                            }
                        } else {
                            if (input[16] <= 0.5) {
                                var12 = new double[] {0.0, 0.5, 0.5};
                            } else {
                                var12 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                            }
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            if (input[24] <= 0.5) {
                                var12 = new double[] {0.0, 0.2, 0.8};
                            } else {
                                var12 = new double[] {0.8, 0.2, 0.0};
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var13;
        if (input[15] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[16] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var13 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var13 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        if (input[21] <= 0.5) {
                            var13 = new double[] {0.5, 0.0, 0.5};
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var13 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[36] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var13 = new double[] {0.5, 0.0, 0.5};
                        }
                    } else {
                        if (input[20] <= 0.5) {
                            var13 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            if (input[12] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[19] <= 0.5) {
                        var13 = new double[] {0.0, 0.2222222222222222, 0.7777777777777778};
                    } else {
                        if (input[30] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[37] <= 0.5) {
                    var13 = new double[] {0.8, 0.2, 0.0};
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[26] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[39] <= 0.5) {
                            if (input[2] <= 0.5) {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[25] <= 0.5) {
                                    var13 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var13 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var13 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        }
                    } else {
                        if (input[34] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var13 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var13 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[32] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                            }
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            if (input[7] <= 0.5) {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[4] <= 0.5) {
                                    var13 = new double[] {0.0, 0.8, 0.2};
                                } else {
                                    var13 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[3] <= 0.5) {
                                var13 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                            } else {
                                if (input[38] <= 0.5) {
                                    var13 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var13 = new double[] {0.0, 0.6, 0.4};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var14;
        if (input[0] <= 0.5) {
            if (input[30] <= 0.5) {
                var14 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[7] <= 0.5) {
                    var14 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[20] <= 0.5) {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[31] <= 0.5) {
                            if (input[26] <= 0.5) {
                                var14 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var14 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            var14 = new double[] {0.0, 1.0, 0.0};
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine3(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14);
    }
    public static double[] subroutine3(double[] input) {
        double[] var0;
        if (input[0] <= 0.5) {
            if (input[30] <= 0.5) {
                var0 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[36] <= 0.5) {
                    var0 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[21] <= 0.5) {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[26] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var0 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        }
                    }
                }
            }
        } else {
            var0 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var1;
        if (input[15] <= 0.5) {
            if (input[14] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[27] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var1 = new double[] {0.5714285714285714, 0.0, 0.42857142857142855};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[8] <= 0.5) {
                            if (input[7] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                                }
                            } else {
                                if (input[11] <= 0.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.75, 0.25, 0.0};
                                }
                            }
                        } else {
                            if (input[27] <= 0.5) {
                                if (input[13] <= 0.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var1 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[36] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var1 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[37] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[18] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                }
            } else {
                if (input[24] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[11] <= 0.5) {
                            if (input[13] <= 0.5) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[29] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            }
                        } else {
                            if (input[35] <= 0.5) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[21] <= 0.5) {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[32] <= 0.5) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[40] <= 0.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[3] <= 0.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var2;
        if (input[29] <= 0.5) {
            if (input[25] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[32] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[3] <= 0.5) {
                                var2 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[33] <= 0.5) {
                                var2 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var2 = new double[] {0.4, 0.6, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var2 = new double[] {0.1, 0.9, 0.0};
                    } else {
                        var2 = new double[] {0.875, 0.0, 0.125};
                    }
                } else {
                    if (input[38] <= 0.5) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var2 = new double[] {0.2, 0.4, 0.4};
                    }
                }
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[0] <= 0.5) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[28] <= 0.5) {
                        var2 = new double[] {0.0, 0.5, 0.5};
                    } else {
                        if (input[17] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var2 = new double[] {0.0, 0.2, 0.8};
                        }
                    }
                } else {
                    if (input[33] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var2 = new double[] {0.0, 0.25, 0.75};
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var3;
        if (input[37] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[35] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[40] <= 0.5) {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var3 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    } else {
                        var3 = new double[] {0.14285714285714285, 0.14285714285714285, 0.7142857142857143};
                    }
                } else {
                    if (input[22] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[13] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                var3 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[20] <= 0.5) {
                if (input[32] <= 0.5) {
                    if (input[35] <= 0.5) {
                        var3 = new double[] {0.25, 0.75, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            if (input[39] <= 0.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[18] <= 0.5) {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var3 = new double[] {0.25, 0.75, 0.0};
                    }
                }
            } else {
                if (input[24] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[17] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[38] <= 0.5) {
                                if (input[19] <= 0.5) {
                                    var3 = new double[] {0.0, 0.2222222222222222, 0.7777777777777778};
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var3 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var4;
        if (input[24] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[27] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var4 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[32] <= 0.5) {
                        if (input[33] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var4 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                if (input[26] <= 0.5) {
                                    var4 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var4 = new double[] {0.0, 0.2, 0.8};
                                }
                            }
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[38] <= 0.5) {
                if (input[0] <= 0.5) {
                    var4 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[17] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var4 = new double[] {0.125, 0.125, 0.75};
                    } else {
                        if (input[9] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[30] <= 0.5) {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var5;
        if (input[24] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[29] <= 0.5) {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var5 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[26] <= 0.5) {
                        if (input[25] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        }
                    } else {
                        if (input[16] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[25] <= 0.5) {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var5 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                } else {
                    var5 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[36] <= 0.5) {
                if (input[25] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[40] <= 0.5) {
                            if (input[15] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        } else {
                            var5 = new double[] {0.6, 0.4, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[14] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[35] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    if (input[38] <= 0.5) {
                        var5 = new double[] {0.6, 0.4, 0.0};
                    } else {
                        if (input[35] <= 0.5) {
                            var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[10] <= 0.5) {
                            if (input[37] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            if (input[28] <= 0.5) {
                                var5 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                if (input[29] <= 0.5) {
                                    var5 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[0] <= 0.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var6;
        if (input[37] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var6 = new double[] {0.5, 0.0, 0.5};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[40] <= 0.5) {
                            if (input[39] <= 0.5) {
                                var6 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                if (input[21] <= 0.5) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.75, 0.25, 0.0};
                                }
                            }
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var6 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[25] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[28] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var6 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[13] <= 0.5) {
                if (input[33] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 0.5) {
                                var6 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                if (input[5] <= 0.5) {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var6 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                }
                            }
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            var6 = new double[] {0.4285714285714286, 0.28571428571428575, 0.28571428571428575};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[24] <= 0.5) {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            if (input[0] <= 0.5) {
                                var6 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[38] <= 0.5) {
                                var6 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var6 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var7;
        if (input[0] <= 0.5) {
            if (input[24] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[17] <= 0.5) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[11] <= 0.5) {
                            var7 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var7 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[19] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[3] <= 0.5) {
                                if (input[21] <= 0.5) {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var7 = new double[] {0.0, 0.5, 0.5};
                                }
                            } else {
                                var7 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    } else {
                        if (input[33] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[5] <= 0.5) {
                                if (input[35] <= 0.5) {
                                    var7 = new double[] {0.8, 0.0, 0.2};
                                } else {
                                    var7 = new double[] {0.5, 0.0, 0.5};
                                }
                            } else {
                                if (input[28] <= 0.5) {
                                    var7 = new double[] {0.2, 0.0, 0.8};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[26] <= 0.5) {
                        if (input[37] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.8571428571428571, 0.0, 0.14285714285714285};
                        }
                    } else {
                        if (input[19] <= 0.5) {
                            var7 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        } else {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var7 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    } else {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            var7 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var8;
        if (input[17] <= 0.5) {
            if (input[20] <= 0.5) {
                if (input[13] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[39] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var8 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    }
                } else {
                    if (input[18] <= 0.5) {
                        var8 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        if (input[10] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[26] <= 0.5) {
                                var8 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[25] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[31] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 0.1111111111111111, 0.8888888888888888};
                            }
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var8 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                        } else {
                            if (input[35] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.0, 0.25, 0.75};
                            }
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var8 = new double[] {0.0, 0.2, 0.8};
                    } else {
                        if (input[0] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[26] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.6, 0.4, 0.0};
                            }
                        } else {
                            if (input[37] <= 0.5) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                            }
                        }
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[32] <= 0.5) {
                        var8 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                    } else {
                        var8 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[37] <= 0.5) {
                            if (input[40] <= 0.5) {
                                var8 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var8 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    } else {
                        if (input[35] <= 0.5) {
                            var8 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            if (input[1] <= 0.5) {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var8 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            }
                        }
                    }
                } else {
                    if (input[37] <= 0.5) {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var8 = new double[] {0.125, 0.0, 0.875};
                            } else {
                                var8 = new double[] {0.8, 0.0, 0.2};
                            }
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var9;
        if (input[0] <= 0.5) {
            if (input[30] <= 0.5) {
                var9 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[35] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.0, 0.5, 0.5};
                        }
                    } else {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[32] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[24] <= 0.5) {
                                if (input[12] <= 0.5) {
                                    var9 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var9 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            } else {
                                var9 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[21] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            var9 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var10;
        if (input[24] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[36] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[34] <= 0.5) {
                            if (input[7] <= 0.5) {
                                var10 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var10 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[19] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[7] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var10 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                var10 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[28] <= 0.5) {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[15] <= 0.5) {
                            var10 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            if (input[9] <= 0.5) {
                                var10 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var10 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var10 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                var10 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var11;
        if (input[0] <= 0.5) {
            if (input[37] <= 0.5) {
                if (input[30] <= 0.5) {
                    var11 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[20] <= 0.5) {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var11 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[29] <= 0.5) {
                    if (input[36] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var11 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            if (input[32] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[39] <= 0.5) {
                                    var11 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var11 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                }
                            }
                        } else {
                            if (input[39] <= 0.5) {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var11 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            }
                        }
                    }
                } else {
                    if (input[13] <= 0.5) {
                        if (input[11] <= 0.5) {
                            if (input[38] <= 0.5) {
                                var11 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var11 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            var11 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var12;
        if (input[24] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[30] <= 0.5) {
                    var12 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[23] <= 0.5) {
                        if (input[16] <= 0.5) {
                            if (input[9] <= 0.5) {
                                var12 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var12 = new double[] {0.0, 0.25, 0.75};
                            }
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var12 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                        }
                    }
                }
            } else {
                var12 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[27] <= 0.5) {
                if (input[13] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[26] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var12 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var12 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var12 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[25] <= 0.5) {
                                var12 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var12 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[38] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var12 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    } else {
                        if (input[33] <= 0.5) {
                            var12 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var12 = new double[] {0.6, 0.4, 0.0};
                        } else {
                            if (input[25] <= 0.5) {
                                var12 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            } else {
                                var12 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var13;
        if (input[24] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[7] <= 0.5) {
                                var13 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[31] <= 0.5) {
                                    var13 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                } else {
                                    var13 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    }
                }
            } else {
                var13 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[35] <= 0.5) {
                    if (input[8] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var13 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var13 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var13 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[18] <= 0.5) {
                    if (input[28] <= 0.5) {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var13 = new double[] {0.0, 0.5, 0.5};
                    }
                } else {
                    var13 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var14;
        if (input[0] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[14] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var14 = new double[] {0.75, 0.25, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[7] <= 0.5) {
                                var14 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var14 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        var14 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        var14 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    var14 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[24] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var14 = new double[] {0.16666666666666666, 0.0, 0.8333333333333334};
                        } else {
                            if (input[9] <= 0.5) {
                                if (input[28] <= 0.5) {
                                    var14 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var14 = new double[] {0.5, 0.0, 0.5};
                                }
                            } else {
                                var14 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            var14 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var15;
        if (input[30] <= 0.5) {
            if (input[27] <= 0.5) {
                if (input[33] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var15 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var15 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                        }
                    } else {
                        var15 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var15 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var15 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[20] <= 0.5) {
                        var15 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[34] <= 0.5) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.8, 0.2, 0.0};
                        }
                    }
                } else {
                    if (input[39] <= 0.5) {
                        var15 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[22] <= 0.5) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.6, 0.4, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[36] <= 0.5) {
                var15 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[14] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var15 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var15 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[19] <= 0.5) {
                                var15 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var15 = new double[] {0.0, 0.6, 0.4};
                            }
                        } else {
                            if (input[38] <= 0.5) {
                                var15 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[19] <= 0.5) {
                                    var15 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var15 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                }
                            }
                        }
                    }
                } else {
                    var15 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                }
            }
        }
        double[] var16;
        if (input[20] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[0] <= 0.5) {
                    var16 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var16 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                var16 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var16 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var16 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var16 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[13] <= 0.5) {
                            if (input[18] <= 0.5) {
                                var16 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[23] <= 0.5) {
                                    var16 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var16 = new double[] {0.0, 0.2857142857142857, 0.7142857142857143};
                                }
                            }
                        } else {
                            if (input[7] <= 0.5) {
                                var16 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[21] <= 0.5) {
                                    var16 = new double[] {0.0, 0.6, 0.4};
                                } else {
                                    var16 = new double[] {0.0, 0.5, 0.5};
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[19] <= 0.5) {
                    if (input[37] <= 0.5) {
                        var16 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                    } else {
                        if (input[25] <= 0.5) {
                            var16 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[6] <= 0.5) {
                                var16 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var16 = new double[] {0.0, 0.25, 0.75};
                            }
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[14] <= 0.5) {
                            if (input[34] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    var16 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var16 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var16 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var16 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                        }
                    } else {
                        var16 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var17;
        if (input[24] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[25] <= 0.5) {
                        if (input[21] <= 0.5) {
                            var17 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var17 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[3] <= 0.5) {
                                var17 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var17 = new double[] {0.2, 0.0, 0.8};
                            }
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[32] <= 0.5) {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                var17 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[38] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[34] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var17 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                var17 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var17 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[25] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var17 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var17 = new double[] {0.4, 0.6, 0.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 0.5) {
                                var17 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var17 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[15] <= 0.5) {
                    if (input[35] <= 0.5) {
                        if (input[14] <= 0.5) {
                            if (input[29] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    var17 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var17 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var17 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var17 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var17 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[28] <= 0.5) {
                            if (input[18] <= 0.5) {
                                var17 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var17 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        } else {
                            if (input[8] <= 0.5) {
                                var17 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var17 = new double[] {0.0, 0.5714285714285714, 0.42857142857142855};
                            }
                        }
                    } else {
                        var17 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var18;
        if (input[0] <= 0.5) {
            if (input[20] <= 0.5) {
                if (input[7] <= 0.5) {
                    var18 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[32] <= 0.5) {
                        if (input[13] <= 0.5) {
                            var18 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var18 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        if (input[23] <= 0.5) {
                            var18 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var18 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[24] <= 0.5) {
                    if (input[36] <= 0.5) {
                        var18 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var18 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var18 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[18] <= 0.5) {
                            if (input[30] <= 0.5) {
                                var18 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var18 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var18 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            var18 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var19;
        if (input[7] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[3] <= 0.5) {
                    var19 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[18] <= 0.5) {
                        var19 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                    } else {
                        var19 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var19 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var19 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        }
                    } else {
                        if (input[18] <= 0.5) {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var19 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                        }
                    }
                } else {
                    if (input[24] <= 0.5) {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[26] <= 0.5) {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var19 = new double[] {0.0, 0.75, 0.25};
                        }
                    }
                }
            }
        } else {
            if (input[23] <= 0.5) {
                if (input[27] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var19 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[6] <= 0.5) {
                                var19 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var19 = new double[] {0.0, 0.1111111111111111, 0.8888888888888888};
                            }
                        }
                    } else {
                        var19 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[36] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[31] <= 0.5) {
                                if (input[19] <= 0.5) {
                                    var19 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var19 = new double[] {0.5, 0.5, 0.0};
                                }
                            } else {
                                if (input[18] <= 0.5) {
                                    var19 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var19 = new double[] {0.25, 0.75, 0.0};
                                }
                            }
                        } else {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[8] <= 0.5) {
                                var19 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[11] <= 0.5) {
                                    var19 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var19 = new double[] {0.0, 0.4, 0.6};
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[20] <= 0.5) {
                    var19 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[17] <= 0.5) {
                        var19 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                    } else {
                        var19 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var20;
        if (input[6] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[39] <= 0.5) {
                        var20 = new double[] {0.5, 0.5, 0.0};
                    } else {
                        var20 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var20 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            var20 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var20 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[27] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var20 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[18] <= 0.5) {
                                var20 = new double[] {0.8, 0.2, 0.0};
                            } else {
                                var20 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    } else {
                        var20 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    }
                } else {
                    var20 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[30] <= 0.5) {
                if (input[14] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            if (input[10] <= 0.5) {
                                var20 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var20 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var20 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[31] <= 0.5) {
                            if (input[36] <= 0.5) {
                                var20 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var20 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        } else {
                            if (input[16] <= 0.5) {
                                var20 = new double[] {0.4, 0.6, 0.0};
                            } else {
                                var20 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                } else {
                    var20 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                }
            } else {
                if (input[29] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var20 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var20 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[38] <= 0.5) {
                        var20 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[0] <= 0.5) {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var21;
        if (input[36] <= 0.5) {
            if (input[23] <= 0.5) {
                if (input[35] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var21 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[8] <= 0.5) {
                                var21 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var21 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    } else {
                        var21 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[25] <= 0.5) {
                            var21 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var21 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var21 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var21 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var21 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[33] <= 0.5) {
                    if (input[29] <= 0.5) {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var21 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                    }
                } else {
                    if (input[24] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var21 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var21 = new double[] {0.8, 0.0, 0.2};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[25] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var21 = new double[] {0.125, 0.0, 0.875};
                        } else {
                            var21 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        if (input[37] <= 0.5) {
                            if (input[2] <= 0.5) {
                                var21 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                            } else {
                                var21 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var21 = new double[] {0.0, 0.6, 0.4};
                        }
                    }
                } else {
                    if (input[14] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[34] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    var21 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var21 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                                }
                            } else {
                                if (input[33] <= 0.5) {
                                    var21 = new double[] {0.0, 0.5714285714285714, 0.42857142857142855};
                                } else {
                                    var21 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[32] <= 0.5) {
                                if (input[26] <= 0.5) {
                                    var21 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var21 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                                }
                            } else {
                                var21 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var21 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var22;
        if (input[20] <= 0.5) {
            if (input[7] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var22 = new double[] {0.6, 0.4, 0.0};
                    }
                } else {
                    var22 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[39] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var22 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var22 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var22 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[31] <= 0.5) {
                                if (input[21] <= 0.5) {
                                    var22 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var22 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[40] <= 0.5) {
                                    var22 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                } else {
                                    var22 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var22 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var22 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[37] <= 0.5) {
                    if (input[14] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var22 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var22 = new double[] {0.4, 0.2, 0.4};
                        }
                    } else {
                        var22 = new double[] {0.5, 0.5, 0.0};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[32] <= 0.5) {
                            if (input[2] <= 0.5) {
                                var22 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var22 = new double[] {0.4, 0.6, 0.0};
                            }
                        } else {
                            if (input[34] <= 0.5) {
                                var22 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var22 = new double[] {0.16666666666666666, 0.5, 0.3333333333333333};
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var22 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var23;
        if (input[30] <= 0.5) {
            if (input[15] <= 0.5) {
                if (input[32] <= 0.5) {
                    var23 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 0.5) {
                        var23 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var23 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[20] <= 0.5) {
                    var23 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[18] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var23 = new double[] {0.25, 0.75, 0.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[33] <= 0.5) {
                                var23 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var23 = new double[] {0.8, 0.2, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[15] <= 0.5) {
                    if (input[33] <= 0.5) {
                        var23 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var23 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[14] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var23 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var23 = new double[] {0.0, 0.4, 0.6};
                    }
                }
            } else {
                var23 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var24;
        if (input[7] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[38] <= 0.5) {
                            var24 = new double[] {0.25, 0.25, 0.5};
                        } else {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var24 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var24 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[19] <= 0.5) {
                        var24 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[30] <= 0.5) {
                            var24 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var24 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var24 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var24 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[18] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[16] <= 0.5) {
                                var24 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var24 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            if (input[30] <= 0.5) {
                                if (input[17] <= 0.5) {
                                    var24 = new double[] {0.5, 0.5, 0.0};
                                } else {
                                    var24 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var24 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[29] <= 0.5) {
                        var24 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                    } else {
                        if (input[27] <= 0.5) {
                            var24 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            if (input[39] <= 0.5) {
                                var24 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var24 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[27] <= 0.5) {
                        if (input[10] <= 0.5) {
                            if (input[19] <= 0.5) {
                                var24 = new double[] {0.0, 0.5, 0.5};
                            } else {
                                var24 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var24 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var24 = new double[] {0.0, 0.5, 0.5};
                            }
                        } else {
                            if (input[33] <= 0.5) {
                                var24 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var24 = new double[] {0.0, 0.4444444444444444, 0.5555555555555556};
                            }
                        }
                    }
                }
            }
        }
        double[] var25;
        if (input[13] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[37] <= 0.5) {
                    if (input[38] <= 0.5) {
                        var25 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var25 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var25 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[36] <= 0.5) {
                        var25 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[27] <= 0.5) {
                            var25 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var25 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[23] <= 0.5) {
                        if (input[4] <= 0.5) {
                            if (input[5] <= 0.5) {
                                var25 = new double[] {0.0, 0.25, 0.75};
                            } else {
                                var25 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[31] <= 0.5) {
                                var25 = new double[] {0.0, 0.4, 0.6};
                            } else {
                                var25 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var25 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[36] <= 0.5) {
                        var25 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[10] <= 0.5) {
                            if (input[28] <= 0.5) {
                                var25 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var25 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var25 = new double[] {0.0, 0.8, 0.2};
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[18] <= 0.5) {
                            var25 = new double[] {0.0, 0.5, 0.5};
                        } else {
                            var25 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var25 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        var25 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[28] <= 0.5) {
                            var25 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[2] <= 0.5) {
                                var25 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var25 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                var25 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var26;
        if (input[7] <= 0.5) {
            if (input[19] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var26 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var26 = new double[] {0.5, 0.0, 0.5};
                        }
                    } else {
                        var26 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var26 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var26 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var26 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var26 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[5] <= 0.5) {
                                var26 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var26 = new double[] {0.5, 0.0, 0.5};
                            }
                        }
                    }
                } else {
                    var26 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[25] <= 0.5) {
                        if (input[34] <= 0.5) {
                            if (input[38] <= 0.5) {
                                var26 = new double[] {0.75, 0.25, 0.0};
                            } else {
                                var26 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var26 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[26] <= 0.5) {
                            var26 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var26 = new double[] {0.5, 0.5, 0.0};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[16] <= 0.5) {
                            var26 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var26 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        if (input[35] <= 0.5) {
                            var26 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var26 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    }
                }
            } else {
                if (input[15] <= 0.5) {
                    if (input[23] <= 0.5) {
                        if (input[33] <= 0.5) {
                            var26 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            if (input[19] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    var26 = new double[] {0.75, 0.25, 0.0};
                                } else {
                                    var26 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var26 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var26 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[27] <= 0.5) {
                            if (input[12] <= 0.5) {
                                var26 = new double[] {0.14285714285714285, 0.14285714285714285, 0.7142857142857143};
                            } else {
                                if (input[21] <= 0.5) {
                                    var26 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var26 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                var26 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var26 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var26 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var27;
        if (input[0] <= 0.5) {
            if (input[30] <= 0.5) {
                var27 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[6] <= 0.5) {
                    var27 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[8] <= 0.5) {
                        var27 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[21] <= 0.5) {
                            var27 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[28] <= 0.5) {
                                var27 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var27 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            }
        } else {
            var27 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var28;
        if (input[24] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[17] <= 0.5) {
                        var28 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            if (input[22] <= 0.5) {
                                var28 = new double[] {0.9, 0.1, 0.0};
                            } else {
                                var28 = new double[] {0.38461538461538464, 0.6153846153846154, 0.0};
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                var28 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var28 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    var28 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[25] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var28 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[15] <= 0.5) {
                                var28 = new double[] {0.25, 0.0, 0.75};
                            } else {
                                var28 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var28 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var28 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                        }
                    }
                } else {
                    if (input[17] <= 0.5) {
                        if (input[13] <= 0.5) {
                            var28 = new double[] {0.0, 0.5714285714285714, 0.42857142857142855};
                        } else {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[18] <= 0.5) {
                            var28 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        } else {
                            var28 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[27] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[34] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var28 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var28 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var28 = new double[] {0.75, 0.25, 0.0};
                            }
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            if (input[5] <= 0.5) {
                                var28 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var28 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var28 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var28 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[22] <= 0.5) {
                    if (input[31] <= 0.5) {
                        var28 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[5] <= 0.5) {
                                var28 = new double[] {0.0, 0.8, 0.2};
                            } else {
                                var28 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[20] <= 0.5) {
                                var28 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[10] <= 0.5) {
                                    var28 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var28 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[40] <= 0.5) {
                            var28 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            if (input[31] <= 0.5) {
                                var28 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var28 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                            }
                        }
                    }
                }
            }
        }
        double[] var29;
        if (input[23] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[30] <= 0.5) {
                    var29 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[28] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var29 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var29 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            if (input[26] <= 0.5) {
                                if (input[5] <= 0.5) {
                                    var29 = new double[] {0.0, 0.2, 0.8};
                                } else {
                                    var29 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var29 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var29 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                var29 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[36] <= 0.5) {
                    var29 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[9] <= 0.5) {
                        var29 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var29 = new double[] {0.125, 0.25, 0.625};
                    }
                }
            } else {
                if (input[26] <= 0.5) {
                    var29 = new double[] {0.0, 0.8, 0.2};
                } else {
                    var29 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var30;
        if (input[2] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[19] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[20] <= 0.5) {
                            var30 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var30 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[36] <= 0.5) {
                            var30 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var30 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[31] <= 0.5) {
                        if (input[7] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var30 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var30 = new double[] {0.25, 0.0, 0.75};
                            }
                        } else {
                            if (input[17] <= 0.5) {
                                var30 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var30 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var30 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                        } else {
                            var30 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                var30 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[38] <= 0.5) {
                                var30 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var30 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var30 = new double[] {0.0, 0.4, 0.6};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var30 = new double[] {0.4, 0.6, 0.0};
                        } else {
                            var30 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[35] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var30 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var30 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var30 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var30 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                        }
                    }
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[16] <= 0.5) {
                        if (input[19] <= 0.5) {
                            var30 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var30 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[32] <= 0.5) {
                            var30 = new double[] {0.75, 0.25, 0.0};
                        } else {
                            if (input[5] <= 0.5) {
                                var30 = new double[] {0.5, 0.5, 0.0};
                            } else {
                                var30 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[19] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var30 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[5] <= 0.5) {
                                var30 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                            } else {
                                var30 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var30 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[6] <= 0.5) {
                                var30 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[39] <= 0.5) {
                                    var30 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var30 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var31;
        if (input[20] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[23] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var31 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[3] <= 0.5) {
                                var31 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var31 = new double[] {0.5, 0.5, 0.0};
                            }
                        }
                    } else {
                        var31 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var31 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[4] <= 0.5) {
                    var31 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[21] <= 0.5) {
                        var31 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[22] <= 0.5) {
                            var31 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            if (input[13] <= 0.5) {
                                var31 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var31 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[36] <= 0.5) {
                    var31 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[35] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var31 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var31 = new double[] {0.5555555555555556, 0.2222222222222222, 0.2222222222222222};
                        }
                    } else {
                        if (input[14] <= 0.5) {
                            if (input[17] <= 0.5) {
                                var31 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var31 = new double[] {0.2222222222222222, 0.7777777777777778, 0.0};
                            }
                        } else {
                            var31 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[31] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[40] <= 0.5) {
                            var31 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                        } else {
                            if (input[16] <= 0.5) {
                                var31 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var31 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                            }
                        }
                    } else {
                        if (input[17] <= 0.5) {
                            var31 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[0] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    var31 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                } else {
                                    var31 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var31 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[30] <= 0.5) {
                            var31 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        } else {
                            if (input[2] <= 0.5) {
                                var31 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var31 = new double[] {0.0, 0.75, 0.25};
                            }
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            if (input[2] <= 0.5) {
                                var31 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var31 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var31 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var32;
        if (input[36] <= 0.5) {
            if (input[30] <= 0.5) {
                if (input[13] <= 0.5) {
                    var32 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 0.5) {
                        var32 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var32 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var32 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[29] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[10] <= 0.5) {
                            if (input[24] <= 0.5) {
                                var32 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var32 = new double[] {0.5, 0.0, 0.5};
                            }
                        } else {
                            var32 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var32 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[24] <= 0.5) {
                        if (input[11] <= 0.5) {
                            if (input[13] <= 0.5) {
                                if (input[4] <= 0.5) {
                                    var32 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var32 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var32 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[7] <= 0.5) {
                                var32 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                            } else {
                                var32 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var32 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[38] <= 0.5) {
                            var32 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var32 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[37] <= 0.5) {
                            var32 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var32 = new double[] {0.7142857142857143, 0.0, 0.2857142857142857};
                        }
                    }
                } else {
                    var32 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var33;
        if (input[36] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[24] <= 0.5) {
                            var33 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                        } else {
                            var33 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var33 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var33 = new double[] {0.75, 0.25, 0.0};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var33 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                    } else {
                        var33 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                var33 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var33 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var33 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[38] <= 0.5) {
                        if (input[31] <= 0.5) {
                            var33 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                        } else {
                            var33 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var33 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var33 = new double[] {0.0, 0.2, 0.8};
                        }
                    }
                }
            } else {
                if (input[35] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var33 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var33 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var33 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var33 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var33 = new double[] {0.5714285714285714, 0.0, 0.42857142857142855};
                        }
                    } else {
                        var33 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        }
        double[] var34;
        if (input[6] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[29] <= 0.5) {
                    if (input[15] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var34 = new double[] {0.25, 0.75, 0.0};
                        } else {
                            var34 = new double[] {0.8, 0.2, 0.0};
                        }
                    } else {
                        var34 = new double[] {0.2, 0.8, 0.0};
                    }
                } else {
                    var34 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var34 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[36] <= 0.5) {
                if (input[0] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var34 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[9] <= 0.5) {
                            var34 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var34 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var34 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[30] <= 0.5) {
                    if (input[18] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var34 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                        } else {
                            var34 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[33] <= 0.5) {
                            var34 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var34 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[17] <= 0.5) {
                            if (input[19] <= 0.5) {
                                if (input[11] <= 0.5) {
                                    var34 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var34 = new double[] {0.0, 0.25, 0.75};
                                }
                            } else {
                                var34 = new double[] {0.0, 0.25, 0.75};
                            }
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 0.5) {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var34 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var35;
        if (input[37] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[16] <= 0.5) {
                        if (input[9] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var35 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            } else {
                                var35 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var35 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var35 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[30] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var35 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var35 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var35 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var35 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[27] <= 0.5) {
                    if (input[21] <= 0.5) {
                        var35 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            if (input[25] <= 0.5) {
                                var35 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var35 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var35 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[24] <= 0.5) {
                        var35 = new double[] {0.125, 0.875, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var35 = new double[] {0.6, 0.4, 0.0};
                        } else {
                            var35 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[24] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[18] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var35 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[17] <= 0.5) {
                                var35 = new double[] {0.0, 0.6, 0.4};
                            } else {
                                var35 = new double[] {0.2, 0.0, 0.8};
                            }
                        }
                    } else {
                        var35 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var35 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[35] <= 0.5) {
                            if (input[26] <= 0.5) {
                                if (input[1] <= 0.5) {
                                    var35 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var35 = new double[] {0.0, 0.25, 0.75};
                                }
                            } else {
                                var35 = new double[] {0.0, 0.8, 0.2};
                            }
                        } else {
                            if (input[18] <= 0.5) {
                                var35 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var35 = new double[] {0.0, 0.75, 0.25};
                            }
                        }
                    }
                }
            } else {
                if (input[34] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var35 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[32] <= 0.5) {
                                var35 = new double[] {0.25, 0.0, 0.75};
                            } else {
                                var35 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        var35 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        if (input[35] <= 0.5) {
                            var35 = new double[] {0.2, 0.8, 0.0};
                        } else {
                            var35 = new double[] {0.42857142857142855, 0.5714285714285714, 0.0};
                        }
                    } else {
                        if (input[33] <= 0.5) {
                            var35 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var35 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            }
        }
        double[] var36;
        if (input[36] <= 0.5) {
            if (input[29] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[13] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[34] <= 0.5) {
                                var36 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var36 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var36 = new double[] {0.5, 0.5, 0.0};
                        }
                    } else {
                        var36 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[20] <= 0.5) {
                        if (input[1] <= 0.5) {
                            if (input[0] <= 0.5) {
                                var36 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                            } else {
                                var36 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var36 = new double[] {0.8, 0.2, 0.0};
                        }
                    } else {
                        var36 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 0.5) {
                    if (input[39] <= 0.5) {
                        var36 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[18] <= 0.5) {
                            if (input[24] <= 0.5) {
                                var36 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var36 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        } else {
                            var36 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var36 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[37] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[15] <= 0.5) {
                            var36 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var36 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[38] <= 0.5) {
                            if (input[2] <= 0.5) {
                                var36 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                            } else {
                                var36 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[15] <= 0.5) {
                                var36 = new double[] {0.5, 0.0, 0.5};
                            } else {
                                var36 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var36 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[39] <= 0.5) {
                                var36 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var36 = new double[] {0.4, 0.0, 0.6};
                            }
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[1] <= 0.5) {
                                var36 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[4] <= 0.5) {
                                    var36 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var36 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var36 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                        }
                    }
                }
            } else {
                var36 = new double[] {0.0, 1.0, 0.0};
            }
        }
        double[] var37;
        if (input[20] <= 0.5) {
            if (input[0] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var37 = new double[] {0.42857142857142855, 0.5714285714285714, 0.0};
                    } else {
                        if (input[35] <= 0.5) {
                            var37 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var37 = new double[] {0.6, 0.4, 0.0};
                        }
                    }
                } else {
                    if (input[38] <= 0.5) {
                        var37 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var37 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            var37 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                var37 = new double[] {0.0, 1.0, 0.0};
            }
        } else {
            if (input[36] <= 0.5) {
                if (input[30] <= 0.5) {
                    if (input[0] <= 0.5) {
                        var37 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var37 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var37 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var37 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                    } else {
                        var37 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[25] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[35] <= 0.5) {
                                var37 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[40] <= 0.5) {
                                    var37 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var37 = new double[] {0.0, 0.5454545454545454, 0.45454545454545453};
                                }
                            }
                        } else {
                            if (input[17] <= 0.5) {
                                var37 = new double[] {0.0, 0.2, 0.8};
                            } else {
                                var37 = new double[] {0.125, 0.875, 0.0};
                            }
                        }
                    } else {
                        if (input[29] <= 0.5) {
                            if (input[18] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    var37 = new double[] {0.0, 0.5, 0.5};
                                } else {
                                    var37 = new double[] {0.25, 0.0, 0.75};
                                }
                            } else {
                                var37 = new double[] {0.75, 0.0, 0.25};
                            }
                        } else {
                            if (input[37] <= 0.5) {
                                var37 = new double[] {0.75, 0.25, 0.0};
                            } else {
                                if (input[16] <= 0.5) {
                                    var37 = new double[] {0.75, 0.25, 0.0};
                                } else {
                                    var37 = new double[] {0.0, 0.8571428571428571, 0.14285714285714285};
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var38;
        if (input[30] <= 0.5) {
            if (input[36] <= 0.5) {
                if (input[25] <= 0.5) {
                    if (input[26] <= 0.5) {
                        if (input[27] <= 0.5) {
                            var38 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var38 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[27] <= 0.5) {
                        if (input[29] <= 0.5) {
                            var38 = new double[] {0.5, 0.5, 0.0};
                        } else {
                            if (input[18] <= 0.5) {
                                var38 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[9] <= 0.5) {
                                    var38 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                } else {
                                    var38 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var38 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[10] <= 0.5) {
                                var38 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var38 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[37] <= 0.5) {
                        var38 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var38 = new double[] {0.5, 0.5, 0.0};
                    }
                } else {
                    if (input[16] <= 0.5) {
                        if (input[0] <= 0.5) {
                            var38 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[27] <= 0.5) {
                            var38 = new double[] {0.2, 0.8, 0.0};
                        } else {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var38 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[19] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[24] <= 0.5) {
                            var38 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var38 = new double[] {0.0, 0.5, 0.5};
                        }
                    } else {
                        var38 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[25] <= 0.5) {
                        if (input[32] <= 0.5) {
                            var38 = new double[] {0.0, 0.7142857142857143, 0.2857142857142857};
                        } else {
                            if (input[0] <= 0.5) {
                                var38 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var38 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[32] <= 0.5) {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[23] <= 0.5) {
                                var38 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var38 = new double[] {0.0, 0.5, 0.5};
                            }
                        }
                    }
                }
            }
        }
        double[] var39;
        if (input[0] <= 0.5) {
            if (input[15] <= 0.5) {
                if (input[17] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var39 = new double[] {0.8333333333333334, 0.0, 0.16666666666666666};
                        } else {
                            var39 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var39 = new double[] {0.8, 0.0, 0.2};
                    }
                } else {
                    if (input[36] <= 0.5) {
                        if (input[37] <= 0.5) {
                            if (input[34] <= 0.5) {
                                if (input[22] <= 0.5) {
                                    var39 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var39 = new double[] {0.2, 0.8, 0.0};
                                }
                            } else {
                                if (input[11] <= 0.5) {
                                    var39 = new double[] {0.5, 0.5, 0.0};
                                } else {
                                    var39 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            var39 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[32] <= 0.5) {
                            if (input[30] <= 0.5) {
                                var39 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var39 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var39 = new double[] {0.0, 0.5, 0.5};
                        }
                    }
                }
            } else {
                if (input[36] <= 0.5) {
                    if (input[30] <= 0.5) {
                        var39 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var39 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[25] <= 0.5) {
                        if (input[22] <= 0.5) {
                            if (input[35] <= 0.5) {
                                var39 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[5] <= 0.5) {
                                    var39 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                                } else {
                                    var39 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[3] <= 0.5) {
                                var39 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[32] <= 0.5) {
                                    var39 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var39 = new double[] {0.5, 0.0, 0.5};
                                }
                            }
                        }
                    } else {
                        if (input[22] <= 0.5) {
                            var39 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[21] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    var39 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var39 = new double[] {0.5, 0.0, 0.5};
                                }
                            } else {
                                var39 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            }
        } else {
            var39 = new double[] {0.0, 1.0, 0.0};
        }
        double[] var40;
        if (input[6] <= 0.5) {
            if (input[39] <= 0.5) {
                if (input[13] <= 0.5) {
                    var40 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var40 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[30] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var40 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var40 = new double[] {0.6, 0.4, 0.0};
                        }
                    } else {
                        var40 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[0] <= 0.5) {
                        var40 = new double[] {0.6, 0.4, 0.0};
                    } else {
                        var40 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[29] <= 0.5) {
                        if (input[5] <= 0.5) {
                            if (input[35] <= 0.5) {
                                if (input[34] <= 0.5) {
                                    var40 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var40 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[8] <= 0.5) {
                                    var40 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var40 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[16] <= 0.5) {
                            var40 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[40] <= 0.5) {
                            if (input[39] <= 0.5) {
                                if (input[31] <= 0.5) {
                                    var40 = new double[] {0.5, 0.0, 0.5};
                                } else {
                                    var40 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[9] <= 0.5) {
                                    var40 = new double[] {0.14285714285714285, 0.0, 0.8571428571428571};
                                } else {
                                    var40 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                }
                            }
                        } else {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[24] <= 0.5) {
                            if (input[11] <= 0.5) {
                                var40 = new double[] {0.25, 0.0, 0.75};
                            } else {
                                var40 = new double[] {0.5, 0.5, 0.0};
                            }
                        } else {
                            if (input[15] <= 0.5) {
                                if (input[20] <= 0.5) {
                                    var40 = new double[] {0.4, 0.6, 0.0};
                                } else {
                                    var40 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var40 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                var40 = new double[] {0.0, 1.0, 0.0};
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(var0, var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14), var15), var16), var17), var18), var19), var20), var21), var22), var23), var24), var25), var26), var27), var28), var29), var30), var31), var32), var33), var34), var35), var36), var37), var38), var39), var40);
    }
    private static double[] addVectors(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }
    private static double[] mulVectorNumber(double[] v1, double num) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * num;
        }
        return result;
    }
}