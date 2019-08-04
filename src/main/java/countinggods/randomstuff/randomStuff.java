package countinggods.randomstuff;


import countinggods.randomstuff.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = randomStuff.MODID, name = randomStuff.MODNAME, version = randomStuff.MODVERSION, dependencies = "required-after:forge@[14.23.5.2838,)",useMetadata = true)

public class randomStuff {
    public static final String MODID="randomstuff";
    public static final String MODNAME ="Random Stuff";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "countinggods.randomstuff.proxy.ClientProxy", serverSide = "countinggods.randomstuff.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static randomStuff instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        logger = e.getModLog();
        proxy.preInit(e);
    }

    public void init(FMLInitializationEvent e){
        proxy.init(e);

    }

    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }
}
