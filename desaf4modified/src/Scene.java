// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.sims2.ElderPersonResource;
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.resources.automobile.HatchbackResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.MaleElderFullBodyOutfitDressShirtPantsSocksShoes;
import org.lgna.common.RandomUtilities;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.MaleAdultHairShortSimple;
import static org.lgna.common.ThreadUtilities.doTogether;
// </editor-fold>

class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Funciones_y_procedimientos_para_esta_escena */
    public void myFirstMethod() {
// Variables
        Integer[] año_glob = new Integer[]{RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020), RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020), RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020), RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020), RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020), RandomUtilities.nextIntegerFromAToBInclusive(1980, 2020)};
        Double[] costo_glob = new Double[]{Math.rint(RandomUtilities.nextDoubleInRange(1000.0, 10000.0)), Math.rint(RandomUtilities.nextDoubleInRange(1000.0, 10000.0)), Math.rint(RandomUtilities.nextDoubleInRange(1000.0, 10000.0)), Math.rint(RandomUtilities.nextDoubleInRange(1000.0, 10000.0)), Math.rint(RandomUtilities.nextDoubleInRange(1000.0, 10000.0))};
// animacionHuman
        doTogether(() -> {
// Elbow start/twist
        }, () -> {
            this.elderPerson.getRightElbow().roll(RollDirection.RIGHT, 0.125, Roll.duration(0.0));
        }, () -> {
            this.elderPerson.getLeftElbow().roll(RollDirection.LEFT, 0.125, Roll.duration(0.0));
        });
        doTogether(() -> {
// Elbow med/rise
        }, () -> {
            this.elderPerson.getRightElbow().turn(TurnDirection.LEFT, 0.32, Turn.duration(0.25));
        }, () -> {
            this.elderPerson.getLeftElbow().turn(TurnDirection.RIGHT, 0.32, Turn.duration(0.25));
        }, () -> {
// Shoulders start/rise
        }, () -> {
            this.elderPerson.getRightShoulder().turn(TurnDirection.BACKWARD, 0.1, Turn.duration(0.25));
        }, () -> {
            this.elderPerson.getLeftShoulder().turn(TurnDirection.BACKWARD, 0.1, Turn.duration(0.25));
        }, () -> {
// say 
        }, () -> {
            this.elderPerson.say("Bienvenidos...", Say.duration(3.0));
        });
        doTogether(() -> {
// Elbow end/lower
        }, () -> {
            this.elderPerson.getRightElbow().turn(TurnDirection.RIGHT, 0.32, Turn.duration(0.25));
        }, () -> {
            this.elderPerson.getLeftElbow().turn(TurnDirection.LEFT, 0.32, Turn.duration(0.25));
        }, () -> {
// Shoulder med/lower
        }, () -> {
            this.elderPerson.getRightShoulder().turn(TurnDirection.FORWARD, 0.1, Turn.duration(0.25));
        }, () -> {
            this.elderPerson.getLeftShoulder().turn(TurnDirection.FORWARD, 0.1, Turn.duration(0.25));
        });
        doTogether(() -> {
// Elbow end/twist
        }, () -> {
            this.elderPerson.getRightElbow().roll(RollDirection.LEFT, 0.125, Roll.duration(0.0));
        }, () -> {
            this.elderPerson.getLeftElbow().roll(RollDirection.RIGHT, 0.125, Roll.duration(0.0));
        }, () -> {
// say
        }, () -> {
            this.elderPerson.say("Le mostrare los veh\u00EDculos que tenemos disponibles...", Say.duration(3.0));
        });
// Animacioncars
        {
// Limo
            doTogether(() -> {
// -wiiiii
            }, () -> {
                this.limousine.moveToward(this.disc, 9.9);
            }, () -> {
                this.limousine.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
            });
            {
// -Spiiiiiiiiiiiin-
                this.disc.setOpacity(1.0);
                for (Integer indexA = 0; indexA < 2; indexA++) {
                    this.limousine.turn(TurnDirection.RIGHT, 1.0, Turn.duration(8.0));
                }
                this.disc.setOpacity(0.0);
            }
            doTogether(() -> {
// iiiiiw-
            }, () -> {
                this.limousine.moveToward(this.disc, 9.9);
            }, () -> {
                this.limousine.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
            });
        }
        {
// Poli
            doTogether(() -> {
// -wiiiii
            }, () -> {
                this.policeCar.moveToward(this.disc, 7.5);
            }, () -> {
                this.policeCar.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
            });
            {
// -Spiiiiiiiiiiiin-
                this.disc.setOpacity(1.0);
                for (Integer indexB = 0; indexB < 2; indexB++) {
                    this.policeCar.turn(TurnDirection.RIGHT, 1.0, Turn.duration(8.0));
                }
                this.disc.setOpacity(0.0);
            }
            doTogether(() -> {
// iiiiiw-
            }, () -> {
                this.policeCar.moveToward(this.disc, 7.5);
            }, () -> {
                this.policeCar.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
            });
        }
        {
// Taxi
            doTogether(() -> {
// -wiiiii
            }, () -> {
                this.taxi.moveToward(this.disc, 7.0);
            }, () -> {
                this.taxi.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
            });
            {
// -Spiiiiiiiiiiiin-
                this.disc.setOpacity(1.0);
                for (Integer indexC = 0; indexC < 2; indexC++) {
                    this.taxi.turn(TurnDirection.RIGHT, 1.0, Turn.duration(8.0));
                }
                this.disc.setOpacity(0.0);
            }
            doTogether(() -> {
// iiiiiw-
            }, () -> {
                this.taxi.moveToward(this.disc, 7.0);
            }, () -> {
                this.taxi.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
            });
        }
        {
// Sedan
            doTogether(() -> {
// -wiiiii
            }, () -> {
                this.sedan.moveToward(this.disc, 7.5);
            }, () -> {
                this.sedan.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
            });
            {
// -Spiiiiiiiiiiiin-
                this.disc.setOpacity(1.0);
                for (Integer indexD = 0; indexD < 2; indexD++) {
                    this.sedan.turn(TurnDirection.RIGHT, 1.0, Turn.duration(8.0));
                }
                this.disc.setOpacity(0.0);
            }
            doTogether(() -> {
// iiiiiw-
            }, () -> {
                this.sedan.moveToward(this.disc, 7.5);
            }, () -> {
                this.sedan.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
            });
        }
        {
// hatchback
            doTogether(() -> {
// -wiiiii
            }, () -> {
                this.hatchback.moveToward(this.disc, 8.0);
            }, () -> {
                this.hatchback.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
            });
            {
// -Spiiiiiiiiiiiin-
                this.disc.setOpacity(1.0);
                for (Integer indexE = 0; indexE < 2; indexE++) {
                    this.hatchback.turn(TurnDirection.RIGHT, 1.0, Turn.duration(8.0));
                }
                this.disc.setOpacity(0.0);
            }
            doTogether(() -> {
// iiiiiw-
            }, () -> {
                this.hatchback.moveToward(this.disc, 8.0);
            }, () -> {
                this.hatchback.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
            });
        }
        doTogether(() -> {
// SPAWN ABCDE ALL
        }, () -> {
            this.A1.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.A_COST.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.B.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.B_COST.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.C.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.C_COST.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.D.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.D_COST.setOpacity(1.0, SetOpacity.duration(1.0));
        }, () -> {
            this.E.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            this.E_COST.setOpacity(1.0, SetOpacity.duration(0.0));
        }, () -> {
            doTogether(() -> {
                this.A_COST.setValue("$" + costo_glob[0]);
            }, () -> {
                this.B_COST.setValue("$" + costo_glob[1]);
            }, () -> {
                this.C_COST.setValue("$" + costo_glob[2]);
            }, () -> {
                this.D_COST.setValue("$" + costo_glob[3]);
            }, () -> {
                this.E_COST.setValue("$" + costo_glob[4]);
            });
        });
// Price assignment

// Main Body
        Boolean BREAK = true;
        Boolean este_vehiculo = false;
        BREAK = this.getBooleanFromUser("desea comprar algun carro?");
        while (BREAK) {
            Integer ABCDE = this.getIntegerFromUser(" Elige una numero para inspeccionar: 1, 2, 3, 4, o 5");
            if (ABCDE.equals(1)) {
                {
// Limo
                    doTogether(() -> {
// -wiiiii
                    }, () -> {
                        this.limousine.moveToward(this.disc, 9.9);
                    }, () -> {
                        this.limousine.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
                    });
                    this.disc.setOpacity(1.0);
                    doTogether(() -> {
                        this.Año_Vista.setOpacity(1.0);
                    }, () -> {
                        this.Precio_Vista.setOpacity(1.0);
                    }, () -> {
                        this.Año_Vista.setValue("A\u00F1o: " + año_glob[0]);
                    }, () -> {
                        this.Precio_Vista.setValue("$" + costo_glob[0]);
                    });
                    {
                        if (this.getBooleanFromUser("Quieres comprar esta limosina?")) {
                            doTogether(() -> {
                                this.VENDIDO.setOpacity(1.0);
                            }, () -> {
                                this.limousine.delay(10.0);
                            });
                            this.limousine.setOpacity(0.0, SetOpacity.duration(1.0));
                            this.disc.setOpacity(0.0);
                            this.VENDIDO.setOpacity(0.0, SetOpacity.duration(1.0));
                            doTogether(() -> {
                                this.Año_Vista.setOpacity(0.0);
                            }, () -> {
                                this.Precio_Vista.setOpacity(0.0);
                            });
                        } else {
                            doTogether(() -> {
                                this.Año_Vista.setOpacity(0.0);
                            }, () -> {
                                this.Precio_Vista.setOpacity(0.0);
                            });
                            this.disc.setOpacity(0.0);
                            doTogether(() -> {
// iiiiiw-
                            }, () -> {
                                this.limousine.moveToward(this.disc, 9.9);
                            }, () -> {
                                this.limousine.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
                            });
                        }
                    }
                }
            } else {
                if (ABCDE.equals(2)) {
                    {
// Poli
                        doTogether(() -> {
// -wiiiii
                        }, () -> {
                            this.policeCar.moveToward(this.disc, 7.5);
                        }, () -> {
                            this.policeCar.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
                        });
                        this.disc.setOpacity(1.0);
                        doTogether(() -> {
                            this.Año_Vista.setOpacity(1.0);
                        }, () -> {
                            this.Precio_Vista.setOpacity(1.0);
                        }, () -> {
                            this.Año_Vista.setValue("A\u00F1o: " + año_glob[1]);
                        }, () -> {
                            this.Precio_Vista.setValue("$" + costo_glob[1]);
                        });
                        if (this.getBooleanFromUser("Quieres comprar este carro de policia?")) {
                            doTogether(() -> {
                                this.VENDIDO.setOpacity(1.0);
                            }, () -> {
                                this.policeCar.delay(10.0);
                            });
                            this.policeCar.setOpacity(0.0);
                            this.disc.setOpacity(0.0);
                            this.VENDIDO.setOpacity(0.0);
                            doTogether(() -> {
                                this.Año_Vista.setOpacity(0.0);
                            }, () -> {
                                this.Precio_Vista.setOpacity(0.0);
                            });
                        } else {
                            doTogether(() -> {
                                this.Año_Vista.setOpacity(0.0);
                            }, () -> {
                                this.Precio_Vista.setOpacity(0.0);
                            });
                            this.disc.setOpacity(0.0);
                            doTogether(() -> {
// iiiiiw-
                            }, () -> {
                                this.policeCar.moveToward(this.disc, 7.5);
                            }, () -> {
                                this.policeCar.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
                            });
                        }
                    }
                } else {
                    if (ABCDE.equals(3)) {
                        {
// Taxi
                            doTogether(() -> {
// -wiiiii
                            }, () -> {
                                this.taxi.moveToward(this.disc, 7.0);
                            }, () -> {
                                this.taxi.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
                            });
                            this.disc.setOpacity(1.0);
                            doTogether(() -> {
                                this.Año_Vista.setOpacity(1.0);
                            }, () -> {
                                this.Precio_Vista.setOpacity(1.0);
                            }, () -> {
                                this.Año_Vista.setValue("A\u00F1o: " + año_glob[2]);
                            }, () -> {
                                this.Precio_Vista.setValue("$" + costo_glob[2]);
                            });
                            if (this.getBooleanFromUser("Quieres comprar este Taxi?")) {
                                doTogether(() -> {
                                    this.VENDIDO.setOpacity(1.0);
                                }, () -> {
                                    this.taxi.delay(10.0);
                                });
                                this.VENDIDO.setOpacity(0.0);
                                this.disc.setOpacity(0.0);
                                this.taxi.setOpacity(0.0);
                                doTogether(() -> {
                                    this.Año_Vista.setOpacity(0.0);
                                }, () -> {
                                    this.Precio_Vista.setOpacity(0.0);
                                });
                            } else {
                                this.disc.setOpacity(0.0);
                                doTogether(() -> {
// iiiiiw-
                                }, () -> {
                                    this.taxi.moveToward(this.disc, 7.0);
                                }, () -> {
                                    this.taxi.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
                                });
                            }
                        }
                    } else {
                        if (ABCDE.equals(4)) {
                            {
// Sedan
                                doTogether(() -> {
// -wiiiii
                                }, () -> {
                                    this.sedan.moveToward(this.disc, 7.5);
                                }, () -> {
                                    this.sedan.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
                                });
                                this.disc.setOpacity(1.0);
                                doTogether(() -> {
                                    this.Año_Vista.setOpacity(1.0);
                                }, () -> {
                                    this.Precio_Vista.setOpacity(1.0);
                                }, () -> {
                                    this.Año_Vista.setValue("A\u00F1o: " + año_glob[3]);
                                }, () -> {
                                    this.Precio_Vista.setValue("$" + costo_glob[3]);
                                });
                                if (this.getBooleanFromUser("Quieres comprar este Sedan?")) {
                                    doTogether(() -> {
                                        this.VENDIDO.setOpacity(1.0);
                                    }, () -> {
                                        this.sedan.delay(10.0);
                                    });
                                    this.sedan.setOpacity(0.0);
                                    this.disc.setOpacity(0.0);
                                    this.VENDIDO.setOpacity(0.0);
                                    doTogether(() -> {
                                        this.Año_Vista.setOpacity(0.0);
                                    }, () -> {
                                        this.Precio_Vista.setOpacity(0.0);
                                    });
                                } else {
                                    doTogether(() -> {
                                        this.Año_Vista.setOpacity(0.0);
                                    }, () -> {
                                        this.Precio_Vista.setOpacity(0.0);
                                    });
                                    this.disc.setOpacity(0.0);
                                    doTogether(() -> {
// iiiiiw-
                                    }, () -> {
                                        this.sedan.moveToward(this.disc, 7.5);
                                    }, () -> {
                                        this.sedan.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
                                    });
                                }
                            }
                        } else {
                            if (ABCDE.equals(5)) {
                                {
// hatchback
                                    doTogether(() -> {
// -wiiiii
                                    }, () -> {
                                        this.hatchback.moveToward(this.disc, 8.0);
                                    }, () -> {
                                        this.hatchback.turn(TurnDirection.RIGHT, 0.1, Turn.duration(1.0));
                                    });
                                    this.disc.setOpacity(1.0);
                                    doTogether(() -> {
                                        this.Año_Vista.setOpacity(1.0);
                                    }, () -> {
                                        this.Precio_Vista.setOpacity(1.0);
                                    }, () -> {
                                        this.Año_Vista.setValue("A\u00F1o: " + año_glob[4]);
                                    }, () -> {
                                        this.Precio_Vista.setValue("$" + costo_glob[4]);
                                    });
                                    if (this.getBooleanFromUser("Quieres comprar este hatchback?")) {
                                        doTogether(() -> {
                                            this.VENDIDO.setOpacity(1.0);
                                        }, () -> {
                                            this.hatchback.delay(10.0);
                                        });
                                        this.hatchback.setOpacity(0.0);
                                        this.disc.setOpacity(0.0);
                                        this.VENDIDO.setOpacity(0.0);
                                        doTogether(() -> {
                                            this.Precio_Vista.setOpacity(0.0);
                                        }, () -> {
                                            this.Año_Vista.setOpacity(0.0);
                                        });
                                    } else {
                                        doTogether(() -> {
                                            this.Año_Vista.setOpacity(0.0);
                                        }, () -> {
                                            this.Precio_Vista.setOpacity(0.0);
                                        });
                                        this.disc.setOpacity(0.0);
                                        doTogether(() -> {
// iiiiiw-
                                        }, () -> {
                                            this.hatchback.moveToward(this.disc, 8.0);
                                        }, () -> {
                                            this.hatchback.turn(TurnDirection.LEFT, 0.1, Turn.duration(1.0));
                                        });
                                    }
                                }
                            } else {
                                this.elderPerson.say("debes elegir una letra", Say.textScale(2.0), Say.fontColor(Color.MAGENTA), Say.duration(2.0));
                                this.elderPerson.say("solo A, B, C, D o E", Say.textScale(2.0), Say.fontColor(Color.RED), Say.duration(2.0));
                                this.elderPerson.say("y en mayusculas porque no me odio :)", Say.fontColor(Color.GREEN), Say.duration(2.0));
                            }
                        }
                    }
                }
            }
        }
        this.elderPerson.say("Hasta luego, este programa ya finalizo", Say.duration(10.0));
    }
    /* Fin_de_las_funciones_y_procedimientos_para_esta_escena */

    // <editor-fold defaultstate="collapsed" desc="/* campos_de_la_escena */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final ElderPerson elderPerson = new ElderPerson((new ElderPersonResource(Gender.MALE, (new Color(0.741, 0.506, 0.353)), BaseEyeColor.GREEN, MaleAdultHairShortSimple.GREY, 0.512345, MaleElderFullBodyOutfitDressShirtPantsSocksShoes.YELLOW_SHIRT_BROWN_PANTS_SUS, BaseFace.HUMAN_14)));
    private final PoliceCar policeCar = new PoliceCar();
    private final Taxi taxi = new Taxi();
    private final Limousine limousine = new Limousine();
    private final Sedan sedan = new Sedan();
    private final Hatchback hatchback = new Hatchback(HatchbackResource.DEFAULT);
    private final Disc disc = new Disc();
    private final TextModel A1 = new TextModel();
    private final TextModel B = new TextModel();
    private final TextModel C = new TextModel();
    private final TextModel D = new TextModel();
    private final TextModel E = new TextModel();
    private final TextModel A_COST = new TextModel();
    private final TextModel B_COST = new TextModel();
    private final TextModel C_COST = new TextModel();
    private final TextModel D_COST = new TextModel();
    private final TextModel E_COST = new TextModel();
    private final TextModel Año_Vista = new TextModel();
    private final TextModel Precio_Vista = new TextModel();
    private final TextModel VENDIDO = new TextModel();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Configuración_de_escena */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.886, 0.831, 0.51));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.322, 0.075, 0.0));
        this.setFogDensity(0.2);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.BRICK);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-5.47E-4, 0.985246, 0.171114, 0.003182));
        this.camera.setPositionRelativeToVehicle(new Position(-1.002, 6.761, -19.593));
        this.elderPerson.setPaint(Color.WHITE);
        this.elderPerson.setOpacity(1.0);
        this.elderPerson.setName("elderPerson");
        this.elderPerson.setVehicle(this);
        this.elderPerson.setOrientationRelativeToVehicle(new Orientation(0.159913, 0.245154, 0.01113, 0.95614));
        this.elderPerson.setPositionRelativeToVehicle(new Position(2.07, 0.0, -12.749));
        this.elderPerson.setSize(new Size(1.049, 4.402, 0.763));
        this.policeCar.setPaint(Color.WHITE);
        this.policeCar.setOpacity(1.0);
        this.policeCar.setName("policeCar");
        this.policeCar.setVehicle(this);
        this.policeCar.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.policeCar.setPositionRelativeToVehicle(new Position(1.099, 0.0, -1.793));
        this.taxi.setPaint(Color.WHITE);
        this.taxi.setOpacity(1.0);
        this.taxi.setName("taxi");
        this.taxi.setVehicle(this);
        this.taxi.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.taxi.setPositionRelativeToVehicle(new Position(-1.347, 0.0, -2.024));
        this.limousine.setPaint(Color.WHITE);
        this.limousine.setOpacity(1.0);
        this.limousine.setName("limousine");
        this.limousine.setVehicle(this);
        this.limousine.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.limousine.setPositionRelativeToVehicle(new Position(3.394, 0.0, -0.128));
        this.sedan.setPaint(Color.WHITE);
        this.sedan.setOpacity(1.0);
        this.sedan.setName("sedan");
        this.sedan.setVehicle(this);
        this.sedan.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.sedan.setPositionRelativeToVehicle(new Position(-3.75, 0.0, -1.751));
        this.hatchback.setPaint(Color.WHITE);
        this.hatchback.setOpacity(1.0);
        this.hatchback.setName("hatchback");
        this.hatchback.setVehicle(this);
        this.hatchback.setOrientationRelativeToVehicle(new Orientation(0.0, -0.005504, 0.0, 0.999985));
        this.hatchback.setPositionRelativeToVehicle(new Position(-6.194, 0.0, -1.876));
        this.disc.setRadius(3.201193);
        this.disc.setPaint(Color.LIGHT_BLUE);
        this.disc.setOpacity(0.0);
        this.disc.setName("disc");
        this.disc.setVehicle(this);
        this.disc.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.disc.setPositionRelativeToVehicle(new Position(-1.808, 2.485, -7.947));
        this.A1.setValue("A");
        this.A1.setPaint(Color.WHITE);
        this.A1.setOpacity(0.0);
        this.A1.setName("A1");
        this.A1.setVehicle(this);
        this.A1.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.A1.setPositionRelativeToVehicle(new Position(2.845, 2.548, -1.012));
        this.A1.setSize(new Size(1.335, 1.429, 0.042));
        this.B.setValue("B");
        this.B.setPaint(Color.WHITE);
        this.B.setOpacity(0.0);
        this.B.setName("B");
        this.B.setVehicle(this);
        this.B.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.B.setPositionRelativeToVehicle(new Position(0.806, 2.55, -2.01));
        this.B.setSize(new Size(1.079, 1.43, 0.042));
        this.C.setValue("C");
        this.C.setPaint(Color.WHITE);
        this.C.setOpacity(0.0);
        this.C.setName("C");
        this.C.setVehicle(this);
        this.C.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.C.setPositionRelativeToVehicle(new Position(-1.332, 2.55, -3.01));
        this.C.setSize(new Size(1.224, 1.43, 0.04));
        this.D.setValue("D");
        this.D.setPaint(Color.WHITE);
        this.D.setOpacity(0.0);
        this.D.setName("D");
        this.D.setVehicle(this);
        this.D.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.D.setPositionRelativeToVehicle(new Position(-3.759, 2.55, -2.01));
        this.D.setSize(new Size(1.183, 1.43, 0.042));
        this.E.setValue("E");
        this.E.setPaint(Color.WHITE);
        this.E.setOpacity(0.0);
        this.E.setName("E");
        this.E.setVehicle(this);
        this.E.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.E.setPositionRelativeToVehicle(new Position(-5.97, 2.55, -1.01));
        this.E.setSize(new Size(1.066, 1.43, 0.042));
        this.A_COST.setValue("0");
        this.A_COST.setPaint(Color.MAGENTA);
        this.A_COST.setOpacity(0.0);
        this.A_COST.setName("A_COST");
        this.A_COST.setVehicle(this);
        this.A_COST.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.A_COST.setPositionRelativeToVehicle(new Position(2.85, 1.75, -1.191));
        this.A_COST.setSize(new Size(0.2, 0.313, 0.009));
        this.B_COST.setValue("0");
        this.B_COST.setPaint(Color.CYAN);
        this.B_COST.setOpacity(0.0);
        this.B_COST.setName("B_COST");
        this.B_COST.setVehicle(this);
        this.B_COST.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.B_COST.setPositionRelativeToVehicle(new Position(0.81, 1.746, -2.19));
        this.B_COST.setSize(new Size(0.2, 0.313, 0.009));
        this.C_COST.setValue("0");
        this.C_COST.setPaint(Color.MAGENTA);
        this.C_COST.setOpacity(0.0);
        this.C_COST.setName("C_COST");
        this.C_COST.setVehicle(this);
        this.C_COST.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.C_COST.setPositionRelativeToVehicle(new Position(-1.33, 1.75, -3.01));
        this.C_COST.setSize(new Size(0.2, 0.313, 0.009));
        this.D_COST.setValue("0");
        this.D_COST.setPaint(Color.CYAN);
        this.D_COST.setOpacity(0.0);
        this.D_COST.setName("D_COST");
        this.D_COST.setVehicle(this);
        this.D_COST.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.D_COST.setPositionRelativeToVehicle(new Position(-3.76, 1.75, -2.01));
        this.D_COST.setSize(new Size(0.2, 0.313, 0.009));
        this.E_COST.setValue("0");
        this.E_COST.setPaint(Color.MAGENTA);
        this.E_COST.setOpacity(0.0);
        this.E_COST.setName("E_COST");
        this.E_COST.setVehicle(this);
        this.E_COST.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.E_COST.setPositionRelativeToVehicle(new Position(-5.97, 1.75, -2.01));
        this.E_COST.setSize(new Size(0.2, 0.313, 0.009));
        this.Año_Vista.setValue("0");
        this.Año_Vista.setPaint(Color.BLACK);
        this.Año_Vista.setOpacity(0.0);
        this.Año_Vista.setName("A\u00F1o_Vista");
        this.Año_Vista.setVehicle(this);
        this.Año_Vista.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.Año_Vista.setPositionRelativeToVehicle(new Position(-1.17, 4.76, -8.687));
        this.Año_Vista.setSize(new Size(0.466, 0.73, 0.021));
        this.Precio_Vista.setValue("0");
        this.Precio_Vista.setPaint(Color.GREEN);
        this.Precio_Vista.setOpacity(0.0);
        this.Precio_Vista.setName("Precio_Vista");
        this.Precio_Vista.setVehicle(this);
        this.Precio_Vista.setOrientationRelativeToVehicle(new Orientation(0.0, -0.003231, 0.0, 0.999995));
        this.Precio_Vista.setPositionRelativeToVehicle(new Position(-1.174, 3.446, -14.118));
        this.Precio_Vista.setSize(new Size(0.466, 0.73, 0.021));
        this.VENDIDO.setValue("VENDIDO");
        this.VENDIDO.setPaint(Color.GREEN);
        this.VENDIDO.setOpacity(0.0);
        this.VENDIDO.setName("VENDIDO");
        this.VENDIDO.setVehicle(this);
        this.VENDIDO.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, -0.107177, 0.99424));
        this.VENDIDO.setPositionRelativeToVehicle(new Position(-1.488, 4.821, -14.605));
        this.VENDIDO.setSize(new Size(4.507, 0.741, 0.021));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Funciones_y_procedimientos_para_multiples_escenas */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public ElderPerson getElderPerson() {
        return this.elderPerson;
    }

    public PoliceCar getPoliceCar() {
        return this.policeCar;
    }

    public Taxi getTaxi() {
        return this.taxi;
    }

    public Limousine getLimousine() {
        return this.limousine;
    }

    public Sedan getSedan() {
        return this.sedan;
    }

    public Hatchback getHatchback() {
        return this.hatchback;
    }

    public Disc getDisc() {
        return this.disc;
    }

    public TextModel getA1() {
        return this.A1;
    }

    public TextModel getB() {
        return this.B;
    }

    public TextModel getC() {
        return this.C;
    }

    public TextModel getD() {
        return this.D;
    }

    public TextModel getE() {
        return this.E;
    }

    public TextModel getA_COST() {
        return this.A_COST;
    }

    public TextModel getB_COST() {
        return this.B_COST;
    }

    public TextModel getC_COST() {
        return this.C_COST;
    }

    public TextModel getD_COST() {
        return this.D_COST;
    }

    public TextModel getE_COST() {
        return this.E_COST;
    }

    public TextModel getAño_Vista() {
        return this.Año_Vista;
    }

    public TextModel getPrecio_Vista() {
        return this.Precio_Vista;
    }

    public TextModel getVENDIDO() {
        return this.VENDIDO;
    }
    // </editor-fold>
}
