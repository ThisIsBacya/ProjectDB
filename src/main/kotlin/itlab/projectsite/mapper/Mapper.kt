package itlab.projectsite.mapper

interface Mapper<Input, Output> {
    operator fun invoke(input: Input): Output
}