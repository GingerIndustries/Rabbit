package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.Location
import community.rto.ginger.rabbit.ast.common.AccessModifier
import community.rto.ginger.rabbit.ast.common.Identifier
import community.rto.ginger.rabbit.ast.common.FullIdentifier

class UntypedStructDeclaration(val identifier: Identifier, val body: UntypedStatements, location: Location) : UntypedNode(listOf(body), location)
class UntypedTraitDeclaration(val identifier: Identifier, val body: UntypedStatements, val parent: FullIdentifier? = null, location: Location) : UntypedNode(listOf(body), location)
class UntypedStructDeclarationTraitImplementation(val trait: FullIdentifier, val body: UntypedStatements, location: Location) : UntypedNode(listOf(body), location)
class UntypedTraitImplementation(val trait: FullIdentifier, val struct: FullIdentifier, val body: UntypedStatements, location: Location) : UntypedNode(listOf(body), location)