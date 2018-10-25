package com.expedia.graphql.schema.exceptions

/**
 * Exception thrown on schema creation if no queries and no mutations are specified.
 */
class InvalidSchemaException : GraphQLKotlinException("Schema requires at least one query or mutation")
