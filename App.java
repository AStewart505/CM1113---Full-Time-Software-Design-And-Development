import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        boolean selection = true;

//----- While Loop used to Prevent Error For incorrect Inputs
        do {
            System.out.println("Please Select A Species From The Following Options"+ "\n");
            System.out.println("Dwarf. Elf. Human. Half Orc.");
            Scanner sc = new Scanner(System.in);
            String speciesChoice = sc.nextLine();
            sc.close();

        
            if (speciesChoice.equals("Dwarf")){
                System.out.println("Please Select your clan.IronForge, StoneHeart or EarthBorn." + "\n");
                Scanner sc2 = new Scanner(System.in);
                String clanChoice = sc2.nextLine();
                sc2.close();
            
                if (clanChoice.equals("IronForge")){
                    Dwarf playerSpecies = new Dwarf(8,4,6,4,8,9,8,"Dwarf","Black Iron Mountains","Iron Mind", Dwarf.Clans.IronForge);
                    playerSpecies.toString();
                }else if(clanChoice.equals("StoneHeart")){
                    Dwarf playerSpecies = new Dwarf(8,4,6,4,8,9,8,"Dwarf","Black Iron Mountains","Stone Fury", Dwarf.Clans.StoneHeart);
                    playerSpecies.toString();
                }else if(clanChoice.equals("EarthBorn")) {
                    Dwarf playerSpecies = new Dwarf(8,4,6,4,8,9,8,"Dwarf","Black Iron Mountains","Gaia's Embrace", Dwarf.Clans.EarthBorn);
                    playerSpecies.toString();
                }
            
            }else if( speciesChoice.equals("Elf")){
                System.out.println("Please Select Your Variant. HIGH, LOW, WOOD, DARK or LIGHT." + "\n");
                Scanner sc3 = new Scanner(System.in);
                String variantChoice = sc3.nextLine();
                sc3.close();
                if (variantChoice.equals("HIGH")){
                    Elf playerSpecies = new Elf(5,8,7,8,6,7,5,"Elf","Sirian Forests","Noble Judgement", Elf.Variants.HIGH);
                    playerSpecies.toString();
                }else if(variantChoice.equals("Low")){
                    Elf playerSpecies = new Elf(5,8,7,8,6,7,5,"Elf","Sirian Forests","Determination", Elf.Variants.LOW);
                    playerSpecies.toString();
                }else if(variantChoice.equals("WOOD")){
                    Elf playerSpecies = new Elf(5, 8, 7, 8, 6, 7, 5, "Elf", "Sirian Forests","Nature's Embrace" ,Elf.Variants.WOOD);
                    playerSpecies.toString();
                }else if(variantChoice.equals("DARK")){
                    Elf playerSpecies = new Elf(5, 8, 7, 8, 6, 7, 5, "Elf", "Sirian Forests","Shadow's Fury", Elf.Variants.DARK);
                    playerSpecies.toString();
                }else if(variantChoice.equals("LIGHT")){
                    Elf playerSpecies = new Elf(5,8,7,8,6,7,5,"Elf","Sirian Forests", "Divide Enlightenment", Elf.Variants.DARK);
                    playerSpecies.toString();
                }

            }else if(speciesChoice.equals("Human")){
                 System.out.println("Please Select your Faction. Adventurers, Hunters, Mages, Crafters or Bandits" + "\n");
                Scanner sc3 = new Scanner(System.in);
                String factionChoice = sc3.nextLine();
                sc3.close();
                if (factionChoice.equals("Adventurers")){
                    Human playerSpecies = new Human(6,6,5,5,7,8,5,"Human","Eastern Plains","Seeker;s Spirit",Human.Factions.Adventurers);
                    playerSpecies.toString();
                } else if (factionChoice.equals("Hunters")){
                    Human playerSpecies = new Human(6,6,5,5,7,8,5,"Human","Eastern Plains", "Avaricious Challenger", Human.Factions.Hunters);
                    playerSpecies.toString();
                } else if (factionChoice.equals("Mages")){
                    Human playerSpecies = new Human(6,6,5,5,7,8,5,"Human","Eastern Plains", "Arcane Insight", Human.Factions.Mages);
                    playerSpecies.toString();
                }else if (factionChoice.equals("Crafters")){
                    Human playerSpecies = new Human(6,6,5,5,7,8,5,"Human","Eastern Plains","Dexterous Mind",Human.Factions.Crafters);
                    playerSpecies.toString();
                }else if (factionChoice.equals("Bandits")){
                    Human playerSpecies = new Human(6,6,5,5,7,8,5,"Human","Eastern Plains","Light Fingered",Human.Factions.Bandits);
                    playerSpecies.toString();
                }
                
            } else if (speciesChoice.equals("Half Orc")){
                System.out.println("Please select your Trive. BloodFang, IronTusks, DeepDweller, ShadowWalker, StoneBreaker" + "\n");
                Scanner sc4 = new Scanner(System.in);
                String tribeChoice = sc4.nextLine();
                sc4.close();
                if (tribeChoice.equals("BloodFang")){
                    HalfOrc playerSpecies = new HalfOrc(8,7,5,4,7,8,8,"Half-Orc","The Gray","Wild Beserker",HalfOrc.Tribes.BloodFang);
                    playerSpecies.toString();
                } else if (tribeChoice.equals("IronTusks")){
                    HalfOrc playerSpecies = new HalfOrc(8,7,5,4,7,8,8,"Half-Orc","The Gray","Bold Defender",HalfOrc.Tribes.IronTusks);
                    playerSpecies.toString();
                }else if (tribeChoice.equals("DeepDweller")){
                    HalfOrc playerSpecies = new HalfOrc(8,7,5,4,7,8,8,"Half-Orc","The Gray","Jungle's Wrath", HalfOrc.Tribes.DeepDweller);
                    playerSpecies.toString();
                } else if (tribeChoice.equals("ShadowWalker")){
                    HalfOrc playerSpecies = new HalfOrc(8,7,5,4,7,8,8,"Half-Orc","The Gray","Dark Embrace", HalfOrc.Tribes.ShadowWalker);
                    playerSpecies.toString();
                } else if (tribeChoice.equals("StoneBreaker")){
                    HalfOrc playerSpecies = new HalfOrc(8,7,5,4,7,8,8,"Half-Orc","The Gray","Terra Breaker", HalfOrc.Tribes.StoneBreaker);
                    playerSpecies.toString();
                }

            }       

            System.out.println("Please select your profession." + "\n");
            System.out.println("Mage, Hunter or Brawler");
            Scanner sc5 = new Scanner(System.in);
            String professionChoice = sc5.nextLine();
            sc5.close();

            if(professionChoice.equals("Mage")){
                System.out.println("Please Select your Element. Lightning, Fire, Ice, Space, Earth");
                Scanner sc6 = new Scanner(System.in);
                String elementChoice = sc6.nextLine(); 
                sc6.close();       
            if (elementChoice.equals("Lightning")){
                Mage playerProffession = new Mage("Mage", "Thunder Aura", 3,4,6,8,6,5,4,Mage.Elements.Lightning);
                playerProffession.toString();
            } else if (elementChoice.equals("Fire")){
                Mage playerProffession = new Mage("Mage", "Inferno Burst", 3,4,6,8,6,5,4,Mage.Elements.Fire);
                playerProffession.toString();
            } else if( elementChoice.equals("Ice")){
                Mage playerProffession = new Mage("Mage", "Frozen Nova", 3,4,6,8,6,5,4,Mage.Elements.Ice);
                playerProffession.toString();
            } else if (elementChoice.equals("Space")){
                Mage playerProffession = new Mage("Mage", "Galactic Call", 3,4,6,8,6,5,4,Mage.Elements.Space);
                playerProffession.toString();
            } else if (elementChoice.equals("Earth")){
                Mage playerProffession = new Mage("Mage", "Iron Heart", 3,4,6,8,6,5,4,Mage.Elements.Earth);
                playerProffession.toString();
            }

        }  if (professionChoice.equals("Hunter")){
            System.out.println("Please Select your Speciality.Assassin, Scout, Marksman.");
            Scanner sc7 = new Scanner(System.in);
            String specialityChoice = sc7.nextLine();
            sc7.close();

            if (specialityChoice.equals("Assassin")){
                Hunter playerProffession = new Hunter("Hunter","Hidden Strike", 5,7,6,5,5,6,4,Hunter.Specialities.Assassin);
                playerProffession.toString();
            } else if (specialityChoice.equals("Scout")){
                Hunter playerProffession = new Hunter("Hunter","Keen Instincts", 5,7,6,5,5,6,4,Hunter.Specialities.Scout);
                playerProffession.toString();
            } else if (specialityChoice.equals("Marksman")){
                Hunter playerProffession = new Hunter("Hunter"," Steady Aim", 5,7,6,5,5,6,4,Hunter.Specialities.Marksman);
                playerProffession.toString();
            }
        
        }  if (professionChoice.equals("Brawler")){
            System.out.println("Please Select your Role. Tanker, Striker, Pugilist.");
            Scanner sc8 = new Scanner(System.in);
            String roleChoice = sc8.nextLine();
            sc8.close();

            if (roleChoice.equals("Tanker")){
                Brawler playerProffession = new Brawler("Brawler","Saltwart Defender",8,3,6,3,6,8,7,Brawler.Roles.Tanker);
                playerProffession.toString();
            } else if (roleChoice.equals("Striker")){
                Brawler playerProffession = new Brawler("Brawler","Bold Blade",8,3,6,3,6,8,7,Brawler.Roles.Striker);
                playerProffession.toString();
            } else if (roleChoice.equals("Pugilist")){
                Brawler playerProffession = new Brawler("Brawler","Solid Fist",8,3,6,3,6,8,7,Brawler.Roles.Pugilist);
                playerProffession.toString();
            }
        }
    }
    while(selection==true);


    }

}


