import mods.hei.description

/*
  Mekanism
*/


// Cabo Universal
crafting.removeByOutput(item('mekanism:transmitter').withNbt(['tier': 0]))
crafting.addShaped(item('mekanism:transmitter').withNbt(['tier': 0]), [
	[item('ic2:itemmisc', 55), item('mekanism:ingot', 4), item('ic2:itemmisc', 55)],
	[item('ic2:itemmisc', 55), item('ic2:itemcable'), item('ic2:itemmisc', 55)], 
	[item('ic2:itemmisc', 55), item('mekanism:ingot', 4), item('ic2:itemmisc', 55)]
])

// Circuito de Controle Avançado
crafting.removeByOutput(item('mekanism:controlcircuit', 1))
crafting.addShaped(item('mekanism:controlcircuit', 1), [
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')],
	[item('mekanism:enrichedalloy'), item('mekanism:controlcircuit'), item('mekanism:enrichedalloy')], 
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')]
])

//Circuito de controle Elite
crafting.removeByOutput(item('mekanism:controlcircuit', 2))
crafting.addShaped(item('mekanism:controlcircuit', 2), [
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')],
	[item('mekanism:enrichedalloy'), item('mekanism:controlcircuit', 1), item('mekanism:enrichedalloy')], 
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')]
])

// Circuit de Controle Final
crafting.removeByOutput(item('mekanism:controlcircuit', 3))
crafting.addShaped(item('mekanism:controlcircuit', 3), [
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')],
	[item('mekanism:enrichedalloy'), item('mekanism:controlcircuit', 2), item('mekanism:enrichedalloy')], 
	[item('mekanism:compressedcarbon'), item('mekanism:enrichedalloy'), item('mekanism:compressedcarbon')]
])


// Digital Miner
crafting.removeByOutput(item('mekanism:machineblock', 4))
crafting.addShaped(item('mekanism:machineblock', 4), [
	[item('mekanism:basicblock', 8), item('ic2:itemmisc', 264), item('mekanism:basicblock', 8)],
	[item('mekanism:teleportationcore'), item('mekanism:controlcircuit', 2), item('mekanism:teleportationcore')], 
	[item('mekanism:basicblock', 8), item('ic2:itemmisc', 264), item('mekanism:basicblock', 8)]
])

/*
  Industrial Craft
*/


// Raw Carebon Mesh
crafting.removeByOutput(item('ic2:itemmisc', 255))
crafting.addShaped(item('ic2:itemmisc', 255), [
	[null,item('ic2:itemmisc', 254),null],
	[item('ic2:itemmisc', 254),item('mekanism:compressedcarbon'),item('ic2:itemmisc', 254)], 
	[null,item('ic2:itemmisc', 254),null]
])


/*
   Extra Utilies 2
*/
// Build Wand
crafting.removeByOutput(item('extrautils2:itembuilderswand'))
crafting.addShaped(item('extrautils2:itembuilderswand'), [
	[null,item('extrautils2:unstableingots'),item('extrautils2:unstableingots')],
	[item('twilightforest:zombie_scepter'),item('twilightforest:lifedrain_scepter'),item('extrautils2:unstableingots')],
	[item('twilightforest:shield_scepter'),item('twilightforest:twilight_scepter'),null]
])

// Destrution Wand
crafting.removeByOutput(item('extrautils2:itemdestructionwand'))
crafting.addShaped(item('extrautils2:itemdestructionwand'), [
	[item('extrautils2:unstableingots'),item('extrautils2:unstableingots'),item('extrautils2:unstableingots')],
	[item('extrautils2:unstableingots'),item('extrautils2:itembuilderswand'),item('extrautils2:unstableingots')],
	[item('extrautils2:unstableingots'),item('extrautils2:unstableingots'),item('extrautils2:unstableingots')]
])


/* 
  QuantumFlux
*/

// Gold Casing
crafting.removeByOutput(item('quantumflux:craftingpiece', 1))
crafting.addShaped(item('quantumflux:craftingpiece', 1), [
	[item('galacticraftplanets:mars', 5),item('extrautils2:unstableingots'),item('galacticraftplanets:mars', 5)],
	[item('extrautils2:unstableingots'),item('mekanism:teleportationcore'),item('extrautils2:unstableingots')],
	[item('galacticraftplanets:mars', 5),item('extrautils2:unstableingots'),item('galacticraftplanets:mars', 5)]
])

// DarkStone
crafting.removeByOutput(item('quantumflux:darkstone'))
crafting.addShaped(item('quantumflux:darkstone'), [
	[item('botania:quartztypedark'),item('minecraft:nether_brick'),item('botania:quartztypedark')],
	[item('minecraft:nether_brick'),item('galacticraftcore:cheese_curd'),item('minecraft:nether_brick')],
	[item('botania:quartztypedark'),item('minecraft:nether_brick'),item('botania:quartztypedark')]
])

