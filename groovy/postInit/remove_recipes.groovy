import net.minecraft.item.ItemStack
import net.minecraft.util.text.TextFormatting
import net.minecraftforge.event.entity.player.ItemTooltipEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.common.MinecraftForge

// Lista única de itens a serem removidos, organizada por mod
def itemsToRemove = [
    // Extra Utils 2
    extraUtils2: [
        'extrautils2:chunkloader',
        'extrautils2:bagofholding',
    ],

    // Mekanism
    mekanism: [
        'mekanism:robit',
        'mekanism:cardboardbox'
    ],

    // Twilight Forest
    twilightForest: [
        'twilightforest:block_and_chain'
    ],

    // Nuclear Craft
    nuclearCraft: [
        'nuclearcraft:solar_panel_basic',
        'nuclearcraft:solar_panel_advanced',
        'nuclearcraft:solar_panel_du',
        'nuclearcraft:solar_panel_elite'
    ],
    
    botania: [
        'botania:baublebox'
    ],

    industrialCraft:[
        'ic2:itemtoolbox',
        'ic2c_extras:containmentbox'
    ],

    immersiveEnginers:[
        'immersiveengineering:toolbox'
    ],
]

// Função para remover itens de crafting
void removeItemsByMod(Map<String, List<String>> itemsMap) {
    itemsMap.values().flatten().each { itemId ->
        crafting.removeByOutput(item(itemId))
    }
}

// Remove os itens usando a lista única
removeItemsByMod(itemsToRemove)
crafting.removeByOutput(item('extrautils2:unstableingots', 1))

event_manager.listen { ItemTooltipEvent event ->
    ItemStack stack = event.itemStack
    String itemName = stack.item.registryName.toString()
    def isBanned = itemsToRemove.values().flatten().any { it == itemName }
    if (isBanned) {
        event.toolTip.add("- - -> Removido / Banido <- - -")
    }
}




crafting.streamRecipes().filter { it.registryName.namespace == 'armourers_workshop' }.each { recipe ->
    crafting.remove(recipe)
}